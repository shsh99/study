import React, { useState } from "react";
import "../assets/chapter15.css";

function Customer() {
  const initialCustomer = [
    {
      cid: 1, // 번호(자동 생성)
      cname: "홍길동", // 사원명
      email: "hong@naver.com", // 이메일
      phone: "010-1234-5678", // 폰번호
    },
    {
      cid: 2, // 번호(자동 생성)
      cname: "장길산", // 사원명
      email: "jang@naver.com", // 이메일
      phone: "010-1234-5678", // 폰번호
    },
    {
      cid: 3, // 번호(자동 생성)
      cname: "임꺽정", // 사원명
      email: "lim@naver.com", // 이메일
      phone: "010-1234-5678", // 폰번호
    },
  ];

  let [customer, setCustomer] = useState(initialCustomer); // 벡엔드로 전송할 변수(insert 요청)

  return (
    <div className="container mt-5">
      <h4> Customer List</h4>

      <ul className="list-group mt-3">
        {customer.map((value, index) => (
          <li class="list-group-item" key={index}>
            <tr class="list-group-item" >
              <td>{value.cname}</td><br/>
              <td>{value.email}</td><br/>
              <td>{value.phone}</td>
            </tr>
          </li>
        ))}
      </ul>
    </div>
  );
}

export default Customer;
