// EmpNop.tsx : rfce
// 상세조회 + 수정/삭제 페이지
import React from "react";
import TitleCom from "../../components/common/TitleCom";
import { useNavigate, useParams } from "react-router-dom";
import { useState } from 'react';
import IEmp from "../../types/IEmp";
import { useEffect } from 'react';
import EmpService from "../../services/EmpService";

function EmpNop() {
  // 전체조회페이지 보내준 기본키 정보 받기
  // todo: useParams() -> url/기본키(eno) 정보를 받게하는 함수
  const { eno } = useParams();
  // todo: 강제 페이지 이동 함수
  let navigate = useNavigate();

  // 변수 정의
  // todo: 객체 초기화
  const initialEmp = {
    eno: "",
    ename: "",
    job: "",
    manager: "",
    hiredate: "",
    salary: "",
    commission: "",
    dno: "",
  };
  // todo: 수정될 사원객체 변수
  const [emp, setEmp] = useState<IEmp>(initialEmp);
  // todo: 화면에서 수정 성공/실패 메세지 변수
  const [message, setMessage] = useState<string>("");

  // 함수 정의
   // todo: 화면이 뜰때 실행되는 이벤트 함수 + eno 값 감시
  // 사용법 : useEffect(()=>{실행문},[변수명])
  useEffect(() => {
    // eno(기본키) 있으면 상세조회 실행
    if (eno) getEmp(eno);
  }, [eno]);

  // todo: 상세조회
  const getEmp = (eno: string) => {
    EmpService.get(eno) // 벡엔드에 상세조회 요청
      .then((response: any) => {
        // 벡엔드 결과(response.data) -> 사원객체 저장
        setEmp(response.data);
        console.log(response.data);
      })
      .catch((e: Error) => {
        console.log(e);
      });
  };

  // todo: 입력창 수동 바인딩 공통함수
  const handleInputChange = (event: React.ChangeEvent<HTMLInputElement>) => {
    const { name, value } = event.target; // 화면값[이름]
    // 화면값 -> emp 객체의 속성에 저장
    setEmp({ ...emp, [name]: value });
  };

  //  todo: 수정 함수
  const updateEmp = () => {
    EmpService.update(emp.eno, emp) // 벡엔드 수정요청
    .then((response)=>{
      console.log(response.data); // 벡엔드 결과 로그
      // 화면에 성공메세지 출력
      setMessage("사원정보가 수정되었습니다.");
    })
    .catch((e:Error)=>{
      console.log(e);
    })
  };

  // todo: 삭제함수
  const deleteEmp = () => {
    EmpService.remove(emp.eno) // 삭제 요청
    .then((response)=>{
      console.log(response.data); // 벡엔드 결과(response.data)
      // 강제 전체조회 페이지로 이동
      // todo: navigate("/이동할url"); 
      navigate("/emp-nop"); 
    })
    .catch((e:Error)=>{
      console.log(e);
    })
  };


  return (
    // 여기
    <>
      {/* 제목 start */}
      <TitleCom title="EmpNop Detail No Page" />
      {/* 제목 end */}

      <>
        {emp ? (
          <div className="col-6 mx-auto">
            {/* 입력창 */}
            <form>
              <div className="row g-3 align-items-center mb-3">
                <div className="col-3">
                  <label htmlFor="ename" className="col-form-label">
                    Ename
                  </label>
                </div>

                <div className="col-9">
                  <input
                    type="text"
                    id="ename"
                    required
                    className="form-control"
                    value={emp.ename}
                    onChange={handleInputChange}
                    placeholder="ename"
                    name="ename"
                  />
                </div>
              </div>

              <div className="row g-3 align-items-center mb-3">
                <div className="col-3">
                  <label htmlFor="loc" className="col-form-label">
                    Job
                  </label>
                </div>
                <div className="col-9">
                  <input
                    type="text"
                    id="job"
                    required
                    className="form-control"
                    value={emp.job}
                    onChange={handleInputChange}
                    placeholder="job"
                    name="job"
                  />
                </div>
              </div>

              <div className="row g-3 align-items-center mb-3">
                <div className="col-3">
                  <label htmlFor="loc" className="col-form-label">
                    Manager
                  </label>
                </div>
                <div className="col-9">
                  <input
                    type="text"
                    id="manager"
                    required
                    className="form-control"
                    value={emp.manager}
                    onChange={handleInputChange}
                    placeholder="manager"
                    name="manager"
                  />
                </div>
              </div>

              <div className="row g-3 align-items-center mb-3">
                <div className="col-3">
                  <label htmlFor="loc" className="col-form-label">
                    Hiredate
                  </label>
                </div>
                <div className="col-9">
                  <input
                    type="text"
                    id="hiredate"
                    required
                    className="form-control"
                    value={emp.hiredate}
                    onChange={handleInputChange}
                    placeholder="hiredate"
                    name="hiredate"
                  />
                </div>
              </div>

              <div className="row g-3 align-items-center mb-3">
                <div className="col-3">
                  <label htmlFor="loc" className="col-form-label">
                    Salary
                  </label>
                </div>
                <div className="col-9">
                  <input
                    type="text"
                    id="salary"
                    required
                    className="form-control"
                    value={emp.salary}
                    onChange={handleInputChange}
                    placeholder="salary"
                    name="salary"
                  />
                </div>
              </div>

              <div className="row g-3 align-items-center mb-3">
                <div className="col-3">
                  <label htmlFor="loc" className="col-form-label">
                    Commission
                  </label>
                </div>
                <div className="col-9">
                  <input
                    type="text"
                    id="commission"
                    required
                    className="form-control"
                    value={emp.commission ?? ""}
                    onChange={handleInputChange}
                    placeholder="commission"
                    name="commission"
                  />
                </div>
              </div>

              <div className="row g-3 align-items-center mb-3">
                <div className="col-3">
                  <label htmlFor="loc" className="col-form-label">
                    Dno
                  </label>
                </div>
                <div className="col-9">
                  <input
                    type="text"
                    id="dno"
                    required
                    className="form-control"
                    value={emp.dno}
                    onChange={handleInputChange}
                    placeholder="dno"
                    name="dno"
                  />
                </div>
              </div>
            </form>

            {/* 삭제/수정 버튼 시작 */}
            <div className="row g-3 mt-3 mb-3">
              <button
                onClick={deleteEmp}
                className="btn btn-outline-danger ms-3 col"
              >
                Delete
              </button>

              <button
                type="submit"
                onClick={updateEmp}
                className="btn btn-outline-success ms-2 col"
              >
                Update
              </button>
            </div>
            {/* 삭제/수정 버튼 끝 */}

            <p>{message}</p>
          </div>
        ) : (
          <div className="col-6 mx-auto">
            <br />
            <p>Please click on a EmpNop...</p>
          </div>
        )}
      </>
    </>
  );
}

export default EmpNop;
