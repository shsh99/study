import React, { useState } from "react";
import "../assets/chapter15.css";
function AddCustomer() {
  const initialCustomer = {
    cid: null,
    cname: "",
    email: "",
    phone: "",
  };

  let [customer, setCustomer] = useState(initialCustomer);

  const handleChange = (event) => {
    let attrValue = event.target.value;
    let attrName = event.target.name;
    setCustomer({ ...customer, [attrName]: attrValue });
  };

  const saveCustomer = () => {
    console.log("저장되었습니다.");
    alert("저장되었습니다.");
  };

  return (
    <div className="submit-form mt-3">
      {/* cname 시작 */}
      <div className="form-group mt-2">
        <label htmlFor="cname">cname</label>
        <input
          type="text"
          className="form-control"
          id="cname"
          required
          value={customer.cname}
          onChange={handleChange}
          name="cname"
        />
      </div>
      {/* ename 끝 */}

      {/* job 시작 */}
      <div className="form-group mt-2">
        <label htmlFor="email">email</label>
        <input
          type="text"
          className="form-control"
          id="email"
          required
          value={customer.email}
          onChange={handleChange}
          name="email"
        />
      </div>
      {/* job 끝 */}

      <div className="form-group mt-2">
        <label htmlFor="phone">phone</label>
        <input
          type="text"
          className="form-control"
          id="phone"
          required
          value={customer.phone}
          onChange={handleChange}
          name="phone"
        />
      </div>

      <button onClick={saveCustomer} className="btn btn-success mt-3">
        Submit
      </button>
    </div>
  );
}

export default AddCustomer;
