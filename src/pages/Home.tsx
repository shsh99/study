import React, { useEffect } from "react";
import TitleCom from "../components/common/TitleCom";
import initWow from "../assets/js/mywow";
import "../assets/css/home.css"


function Home() {
  useEffect(() => {
    initWow();
  });
  return (
    <>
      {/* 제목 start */}
      <TitleCom title="Body profile" />
      {/* 제목 end */}

      <div id="content-wrapper">
        <p className="fs-3 wow bounceIn">
          건강한 내 몸, 기록하고 싶은 내 몸을 남기는 공간 <br />
           Body Profile에 오신것을 환영합니다. <br />
        </p>
        {/* <!-- 로고 아이콘 저작권 표시 --> */}
        <a href="https://www.flation.com/kr/free-icons/" title="건반 아이콘">
          건반 아이콘 제작자: Chanut-is-Industries - Flaticon
        </a>
      </div>
    </>
  );
}

export default Home;
