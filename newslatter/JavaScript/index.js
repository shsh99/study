console.log('Hello Codeit'); 
// 주석
/* 
여러 줄 주석하기는
이렇게 하는 것.
 */

// 변수 = 값
// 함수 = 명령들.


// 변수 선언

function printSum(num1, num2) {
  console.log(num1 + num2);
};

printSum(10, 5);
printSum(123, 4);
printSum(124, 124);

function introduce (name, birth, nationality, job) {
  console.log('안녕하세요! 반갑습니다.')
  console.log('제 이름은 ' + name + ' 입니다.')
  console.log('생년월일은 ' + birth + ' 이고' )
  console.log('국적은 ' + nationality + ' 입니다.')
  console.log('직업은 ' + job + ' 입니다.')
  console.log('잘 부탁드립니다,!')
}

introduce('신동구', '99.05.29', '한국', '개발자 취업준비생' )