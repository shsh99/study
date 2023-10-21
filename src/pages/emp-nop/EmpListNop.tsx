// reace 단축키 : rfce
import React, { useEffect, useState } from 'react'
import TitleCom from '../../components/common/TitleCom'
import IEmp from '../../types/IEmp';
import EmpService from '../../services/EmpService';
import { Link } from 'react-router-dom';

function EmpListNop() {

    // 변수 정의
    // todo: const [변수명, setter함수] = useState<타입>(초기값);
    // todo: 사원 배열 변수
    const [emp, setEmp] = useState<Array<IEmp>>([]);
    // todo: 검색어 변수
    const [searchEname, setSearchEname] = useState<string>("");

    // 함수 정의
    // todo: 화면이 뜰때 실행되는 이벤트
    useEffect(()=>{
        // 전체 조회
        retrieveEmp();
    },[]);

    /** 검색어 수동 바인딩 */
    // 화살표 함수 단축키 : nfn
    const onChangeSearchEname = (e: React.ChangeEvent<HTMLInputElement>) => { 
        // 화면 값 -> 변수에 저장
        setSearchEname(e.target.value);
     }

    /** 전체조회 */
    const retrieveEmp = () => { 
        EmpService.getAll() // 벡엔드에 전체조회 요청
        .then((response:any)=>{
            // 백엔드 결과(response.data) -> 사원객체에 저장
            setEmp(response.data);
            // 로그 출력
            console.log(response.data)
        })
        .catch((e:Error)=>{
            // 에러 로그 출력
            console.log(e);
        })
     }

    /** 검색어 조회 */
    const findByEname = () => { 
        EmpService.findByEname(searchEname) // 벡엔드에 전체조회 요청
        .then((response:any)=>{
            // 백엔드 결과(response.data) -> 사원객체에 저장
            setEmp(response.data);
            // 로그 출력
            console.log(response.data)
        })
        .catch((e:Error)=>{
            // 에러 로그 출력
            console.log(e);
        })
     }

  return (
    // 여기
    <>
    {/* 제목 start */}
    <TitleCom title="Emp List" />
    {/* 제목 end */}

    {/* dname start(검색어 입력창) */}
    <div className="row mb-5 justify-content-center">
      {/* w-50 : 크기 조정, mx-auto : 중앙정렬(margin: 0 auto), justify-content-center */}
      <div className="col-12 w-50 input-group mb-3">
        <input
          type="text"
          className="form-control"
          placeholder="Search by dname"
          value={searchEname}
          onChange={onChangeSearchEname}
        />
        <div className="input-group-append">
          <button
            className="btn btn-outline-secondary"
            type="button"
            onClick={findByEname}
          >
            Search
          </button>
        </div>
      </div>
    </div>
    {/* dname end */}

    {/* table start(본문:반복문) */}
    <div className="col-md-12">
      {/* table start */}
      <table className="table">
        {/* 테이블 제목 시작 */}
        <thead className="table-light">
          <tr>
            <th scope="col">Ename</th>
            <th scope="col">Job</th>
            <th scope="col">Manager</th>
            <th scope="col">Hiredate</th>
            <th scope="col">Salary</th>
            <th scope="col">Commission</th>
            <th scope="col">Dno</th>
            <th scope="col">Actions</th>
          </tr>
        </thead>
        {/* 테이블 제목 끝 */}

        {/* 테이블 본문 시작 */}
        <tbody>
          {emp &&
            emp.map((data) => (
              <tr key={data.eno}>
                <td>{data.ename}</td>
                <td>{data.job}</td>
                <td>{data.manager}</td>
                <td>{data.hiredate}</td>
                <td>{data.salary}</td>
                <td>{data.commission}</td>
                <td>{data.dno}</td>
                <td>
                  <Link to={"/emp-nop/" + data.eno}>
                    <span className="badge bg-success">Edit</span>
                  </Link>
                </td>
              </tr>
            ))}
        </tbody>
        {/* 테이블 본문 끝 */}
      </table>
      {/* table end */}
    </div>
    {/* table end */}
  </>
  )
}

export default EmpListNop