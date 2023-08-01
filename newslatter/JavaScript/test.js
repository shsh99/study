// 여기에 코드를 작성하세요


// 테스트 코드
// bmiCalculator('홀쭉이', 43.52, 160);
// bmiCalculator('코린이', 61.25, 175);
// bmiCalculator('통통이', 77.76, 180);

// function bmiCalculator(name, weight, height) {
//   console.log(name + '님의 ');
//   console.log('체질량지수는 ');
//   console.log(weight / (height * height / 10000) + '입니다.')
// };

function getTwice(number) {
  return number * 2;
}

let x = getTwice(5);
let y = getTwice(2);

console.log(x * y);

// 여기에 코드를 작성하세요


// 조건 입력 테스트
let myMoney = 3650000; // 맡긴 금액 (원)
let saveTerm = 1; // 맡기는 기간 (년)
let interestRate = 4; // 이자율 (%)

// 수령액 계산 테스트
let myInterest = interestCalculator(myMoney, saveTerm, interestRate);
let totalMoney = myMoney + myInterest;

// 출력 테스트
console.log('맡긴 금액은 ' + myMoney + '원 입니다.');
console.log('이자는 ' + myInterest + '원 입니다.');
console.log('최종 받을 금액은 ' + totalMoney + '원 입니다.');
