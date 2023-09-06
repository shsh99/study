// TODO : 1167 : 두 번째 수

// let num = prompt("3개의 숫자를 입력하세요");
// let number = num.split(" ");
// let num1 = Number(number[0]);
// let num2 = Number(number[1]);
// let num3 = Number(number[2]);
// let small, middle, big;
// if (num1 <= num2 && num1 <= num3) {
//   small = num1;
//   if (num2 <= num3) {
//     middle = num2;
//     big = num3;
//   } else {
//     middle = num3;
//     big = num2;
//   }
// } else if (num2 <= num1 && num2 <= num3) {
//   small = num2;
//   if (num1 <= num3) {
//     middle = num1;
//     big = num3;
//   } else {
//     middle = num3;
//     big = num1;
//   }
// } else {
//   small = num3;
//   if (num1 <= num2) {
//     middle = num1;
//     big = num2;
//   } else {
//     middle = num2;
//     big = num1;
//   }
// }

// console.log("작은 순서로 나열 :", small, middle, big);
// console.log("두 번째 수 :", middle);

// TODO : 1168 : 나이 계산 1

// let num = prompt();
// let num2 = num.split(" ");

// if (num2[1] == 1 || num2[1] == 2) {
//   alert(2013 - (parseInt(parseInt(num2[0]) / 10000) + 1900));
// } else {
//   alert(2013 - (parseInt(parseInt(num2[0]) / 10000) + 2000));
// }

// TODO : 1170 : 당신의 학번은? 1

// let num = prompt();
// let num2 = num.split(" ");
// if (parseInt(num2[2]) >= 10) {
//   alert(num2[0] + num2[1] + num2[2]);
// } else {
//   alert(num2[0] + num2[1] + 0 + num2[2]);
// }

// TODO : 1171 : 당신의 학번은? 2

// let num = prompt();
// let num2 = num.split(" ");
// if (parseInt(num2[2]) < 10) {
//   num2[2] = "0" + "0" + num2[2];
// } else if (parseInt(num2[2]) < 100) {
//   num2[2] = 0 + num2[2];
// }

// if (parseInt(num2[1]) < 10) {
//   num2[1] = 0 + num2[1];
// }
// alert(num2[0] + num2[1] + num2[2]);

// TODO : 1172 : 세 수 정렬하기

// let num = prompt();
// let num2 = num.split(" ");
// let min, max, mid;
// if (Math.min(num2[0], num2[1], num2[2]) == num2[0]) {
//   min = num2[0];
// } else if (Math.min(num2[0], num2[1], num2[2]) == num2[1]) {
//   min = num2[1];
// } else {
//   min = num2[2];
// }

// if (Math.max(num2[0], num2[1], num2[2]) == num2[0]) {
//   max = num2[0];
// } else if (Math.max(num2[0], num2[1], num2[2]) == num2[1]) {
//   max = num2[1];
// } else {
//   max = num2[2];
// }

// if (num2[0] != max && num2[0] != min) {
//   mid = num2[0];
// } else if (num2[2] != max && num2[2] != min) {
//   mid = num2[2];
// } else {
//   mid = num2[1];
// }
// alert(min + " " + mid + " " + max);

// TODO : 1173 : 30분전

// let num = prompt();
// let num2 = num.split(" ");

// if (parseInt(num2[1]) < 30) {
//   num2[0]--;
//   num2[1] = 60 + (num2[1] - 30);
// } else {
//   num2[1] = parseInt(num2[1]) - 30;
// }
// alert(num2[0] + " " + num2[1]);

// TODO : 1180 : 만능 휴지통

// let num = Number(prompt());
// let num2;
// if (num > 99) {
//   num2 = parseInt(num / 100) * 100;
//   num -= num2;
// }

// let num3 = (parseInt(num / 10) + (num % 10) * 10) * 2;

// if (num3 <= 50) {
//   alert(num3 + "\n" + "GOOD");
// } else {
//   alert(num3 + "\n" + "OH MY GOD");
// }

// TODO : 1201 : 정수 판별

// let num = Number(prompt());
// if (num > 0) {
//   alert("양수입니다.");
// } else {
//   alert("음수입니다.");
// }

// TODO : 1202 : 등급 판정

// let num = Number(prompt());
// if (num >= 90) {
//   alert("A");
// } else if (num >= 80 && num < 90) {
//   alert("B");
// } else if (num >= 70 && num < 80) {
//   alert("C");
// } else if (num >= 60 && num < 70) {
//   alert("D");
// } else {
//   alert("F");
// }

// TODO : 1203 : 비만도 측정 0

// let num = Number(prompt());
// if (num <= 10) {
//   alert("정상");
// } else if (num <= 20 && num >= 10) {
//   alert("과체중");
// } else {
//   alert("비만");
// }

// TODO 1204 : 영어 서수로 표현하기

// let num = Number(prompt());
// if (num % 10 === 1) {
//   alert(num + "st");
// } else if (num % 10 === 2) {
//   alert(num + "nd");
// } else if (num % 10 === 3) {
//   alert(num + "rd");
// } else {
//   alert(num + "th");
// }

// TODO : 1205 : 최댓값

// let num = prompt();
// let num2 = num.split(" ");
// let first = parseInt(num2[0]);
// let last = parseInt(num2[1]);
// let max = 0;
// if (first + last > max) {
//   max = first + last;
// }
// if (first - last > max) {
//   max = first - last;
// }
// if (last - first > max) {
//   max = last - first;
// }
// if (first * last > max) {
//   max = first * last;
// }
// if (first / last > max) {
//   max = first / last;
// }
// if (last / first > max) {
//   max = last / first;
// }
// if (Math.pow(first, last) > max) {
//   max = Math.pow(first, last);
// }
// if (Math.pow(last, first) > max) {
//   max = Math.pow(last, first);
// }
// alert(max);

// TODO: 1206 : 배수

// let num = prompt();
// let num2 = num2.split(" ");
// if (num2[0] % num2[1] == 0) {
//   alert(num2[1] + "*" + num2[0] / num2[1] + "=" + num2[0]);
// } else if (num2[1] % num2[0] == 0) {
//   alert(num2[0] + "*" + num2[1] / num2[0] + "=" + num2[1]);
// } else {
//   alert("none");
// }

// TODO : 1207 : 윷놀이

// let num = prompt();
// let num2 = num.split(" ");
// let cnt = 0;

// if (num2[0] == 1) {
//   cnt++;
// }
// if (num2[1] == 1) {
//   cnt++;
// }
// if (num2[2] == 1) {
//   cnt++;
// }
// if (num2[3] == 1) {
//   cnt++;
// }

// if (cnt == 1) {
//   alert("도");
// } else if (cnt == 2) {
//   alert("개");
// } else if (cnt == 3) {
//   alert("걸");
// } else if (cnt == 4) {
//   alert("윷");
// } else {
//   alert("모");
// }

// TODO 1210 : 칼로리 계산하기

// let num = prompt();
// let num2 = num.split(" ");
// let m1 = 400;
// let m2 = 340;
// let m3 = 170;
// let m4 = 100;
// let m5 = 70;
// let cnt = 0;

// if (num2[0] == 1) {
//   cnt += m1;
// } else if (num2[0] == 2) {
//   cnt += m2;
// } else if (num2[0] == 3) {
//   cnt += m3;
// } else if (num2[0] == 4) {
//   cnt += m4;
// } else if (num2[0] == 5) {
//   cnt += m5;
// } else {
// }

// if (num2[1] == 1) {
//   cnt += m1;
// } else if (num2[1] == 2) {
//   cnt += m2;
// } else if (num2[1] == 3) {
//   cnt += m3;
// } else if (num2[1] == 4) {
//   cnt += m4;
// } else if (num2[1] == 5) {
//   cnt += m5;
// } else {
// }

// if (cnt > 500) {
//   alert("angry");
// } else {
//   alert("no angry");
// }

// TODO 1212 : 삼각형의 성립 조건

// let num = prompt();
// let num2 = num.split(" ");
// if (
//   Math.max(num2[0], num2[1], num2[2]) * 2 <
//   parseInt(num2[0]) + parseInt(num2[1]) + parseInt(num2[2])
// ) {
//   alert("yes");
// } else {
//   alert("no");
// }

// TODO 1214 : 이 달은 며칠까지 있을까?

// let num = prompt();
// let num2 = num.split(" ");
// if (
//   num2[1] == 1 ||
//   num2[1] == 3 ||
//   num2[1] == 5 ||
//   num2[1] == 7 ||
//   num2[1] == 8 ||
//   num2[1] == 10 ||
//   num2[1] == 12
// ) {
//   alert("31");
// } else if (num2[1] == 2) {
//   if (num2[0] % 400 == 0 || (num2[0] % 4 == 0 && num2[0] % 100 != 0)) {
//     alert("29");
//   } else {
//     alert("28");
//   }
// } else {
//   alert("30");
// }

// TODO 1216 : 컨설팅 회사

// let num = prompt();
// let num2 = num.split(" ");
// if (num2[1] - num2[2] > num2[0]) {
//   alert("advertise");
// } else if (num2[1] - num2[2] == num2[0]) {
//   alert("does not matter");
// } else {
//   alert("do not advertise");
// }

// TODO 1218 : 삼각형 판단하기

// let num = prompt();
// let num2 = num.split(" ");
// let max = Math.max(num2[0], num2[1], num2[2]);
// let min = Math.min(num2[0], num2[1], num2[2]);
// let mid = parseInt(num2[0]) + parseInt(num2[1]) + parseInt(num2[2]) - max - min;

// if (num2[0] == num2[1] && num2[1] == num2[2]) {
//   alert("정삼각형");
// } else if (num2[0] == num2[1] || num2[0] == num2[2] || num2[1] == num2[2]) {
//   alert("이등변삼각형");
// } else if (Math.pow(max, 2) == Math.pow(mid, 2) + Math.pow(min, 2)) {
//   alert("직각삼각형");
// } else if (max < mid + min) {
//   alert("삼각형");
// } else {
//   alert("삼각형아님");
// }

// TODO 1222 : 축구의 신 2

// let num = prompt();
// let num2 = num.split(" ");
// let result = 0;

// if (parseInt(num2[0]) < 90) {
//   if (parseInt(num2[0]) % 10 == 0 || parseInt(num2[0]) % 10 == 5) {
//     result = parseInt(num2[1]) + parseInt((90 - parseInt(num2[0])) / 5);
//   } else {
//     result = parseInt(num2[1]) + parseInt((90 - parseInt(num2[0])) / 5 + 1);
//   }
// } else {
// }

// if (parseInt(result) > parseInt(num2[2])) {
//   alert("win");
// } else if (result == num2[2]) {
//   alert("same");
// } else {
//   alert("lose");
// }

// TODO 1224 : 분수 크기

// let num = prompt();
// let num2 = num.split(" ");
// if (
//   parseInt(num2[0]) / parseInt(num2[1]) >
//   parseInt(num2[2]) / parseInt(num2[3])
// ) {
//   alert(">");
// } else if (
//   parseInt(num2[0]) / parseInt(num2[1]) ==
//   parseInt(num2[2]) / parseInt(num2[3])
// ) {
//   alert("=");
// } else {
//   alert("<");
// }

// TODO 1226 : 이번 주 로또

// let lotto = [5, 8, 14, 24, 32, 41, 1];
// let bonus = 1;

// let num = prompt("로또 번호를 입력하세요 예시(1 2 3 4 5 6)");
// let a = num.split(" ").map(Number);
// let matching = 0;

// for (let i = 0; i < 6; i++) {
//   if (lotto.includes(a[i])) {
//     matching++;
//   }
// }

// let result;

// if (matching === 6) {
//   result = 1;
// } else if (matching === 5 && a.includes(bonus)) {
//   result = 2;
// } else if (matching === 5) {
//   result = 3;
// } else if (matching === 4) {
//   result = 4;
// } else if (matching === 3) {
//   result = 5;
// } else {
//   result = 0;
// }
// alert("당첨 결과 : " + result + "등");

// 또는;

// let a = prompt();
// let b = a.split("\n");
// let c1 = b[0].split(" ");
// let c2 = b[1].split(" ");

// let bonus = c1[6];
// let cnt = 0;
// let bo = 0;

// for (let i = 0; i <= 5; i++) {
//   for (let j = 0; j <= 5; j++) {
//     if (c1[i] == c2[j]) {
//       cnt++;
//     }
//   }
// }

// for (let i = 0; i <= 5; i++) {
//   if (parseInt(c2[i]) == parseInt(bonus)) {
//     bo++;
//   }
// }

// if (cnt == 6) {
//   alert(1);
// } else if (cnt == 5 && bo == 1) {
//   alert(2);
// } else if (cnt == 5) {
//   alert(3);
// } else if (cnt == 4) {
//   alert(4);
// } else if (cnt == 3) {
//   alert(5);
// } else {
//   alert(0);
// }

// TODO 1228 : 비만도 측정 1
// let num = prompt("키와 몸무게를 입력하세요(공백 기준)");
// let num2 = num.split(" ");
// let bmi1 = (num2[0] - 100) * 0.9;
// let bmi2 = ((num2[1] - bmi1) * 100) / bmi1;
// if (bmi2 <= 10) {
//   alert("정상");
// } else if (bmi2 > 10 && bmi2 < 20) {
//   alert("과체중");
// } else {
//   alert("비만");
// }
