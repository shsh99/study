// DeptListNop.tsx
// 전체조회페이지
// react 단축키 : rfce
import React, { useEffect, useState } from "react";
import TitleCom from "../../components/common/TitleCom";
import { Link } from "react-router-dom";
import IDept from "../../types/IDept";
import DeptService from "../../services/DeptService";

function DeptListNop() {
  // 변수 정의
  // todo: 부서배열 변수
  const [dept, setDept] = useState<Array<IDept>>([]);
  // todo: 검색어 변수
  const [searchDname, setSearchDname] = useState<string>("");

  // 함수 정의
  // todo: 화면이 뜨자마자 실행되는 이벤트함수(1번)
  //  사용법 : useEffect(()=>{실행문},[])
  useEffect(() => {
    // 전체 조회 실행
    retrieveDept();
  }, []);

  // todo: 검색어 수동 바인딩 함수
  const onChangeSearchDname = (e: React.ChangeEvent<HTMLInputElement>) => {
    // todo: event.target : input 태그에 현재 걸린 이벤트
    //  => e.target.value : 현재 조작하는 태그의 value 값
    setSearchDname(e.target.value);
  };

  // todo: 전체 조회 함수
  const retrieveDept = () => {
    DeptService.getAll() // backend 요청
      .then((response: any) => {
        // todo: 성공 처리
        setDept(response.data);
        // 로그
        console.log("response", response.data);
      })
      .catch((e: Error) => {
        // todo: 실패 처리
        console.log(e);
      });
  };

  // todo: 검색어 조회 함수
  const findByDname = () => {
    DeptService.findByDname(searchDname) // backend 요청
      .then((response: any) => {
        // todo: 성공 처리
        setDept(response.data);
        // 로그
        console.log("response", response.data);
      })
      .catch((e: Error) => {
        // todo: 실패 처리
        console.log(e);
      });
  };

  return (
    // 여기
    <>
      {/* 제목 start */}
      <TitleCom title="Dept List No Page" />
      {/* 제목 end */}

      {/* dname start(검색창) */}
      <div className="row mb-5 justify-content-center">
        {/* w-50 : 크기 조정, mx-auto : 중앙정렬(margin: 0 auto), justify-content-center */}
        <div className="col-12 w-50 input-group mb-3">
          {/* 입력창 시작 */}
          <input
            type="text"
            className="form-control"
            placeholder="Search by dname"
            value={searchDname}
            onChange={onChangeSearchDname}
          />
          {/* 입력창 끝 */}

          {/* 검색버튼 시작 */}
          <div className="input-group-append">
            <button
              className="btn btn-outline-secondary"
              type="button"
              onClick={findByDname}
            >
              Search
            </button>
          </div>
          {/* 검색버튼 끝 */}
        </div>
      </div>
      {/* dname end */}

      {/* table start(본문) */}
      <div className="col-md-12">
        {/* table start */}
        <table className="table">
          {/* 테이블 제목 시작 */}
          <thead className="table-light">
            <tr>
              <th scope="col">Dname</th>
              <th scope="col">Loc</th>
              <th scope="col">Actions</th>
            </tr>
          </thead>
          {/* 테이블 제목 끝 */}

          {/* TODO: 테이블 데이터 시작 */}
          <tbody>
            {dept &&
              dept.map((data) => (
                <tr key={data.dno}>
                  <td>{data.dname}</td>
                  <td>{data.loc}</td>
                  <td>
                    <Link to={"/dept-nop/" + data.dno}>
                      <span className="badge bg-success">Edit</span>
                    </Link>
                  </td>
                </tr>
              ))}
          </tbody>
          {/* 테이블 데이터 끝 */}
        </table>
        {/* table end */}
      </div>
      {/* table end */}
    </>
  );
}

export default DeptListNop;
