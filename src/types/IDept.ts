// 인터페이스 : == 자바 모델 유사
// => 목적 : 각 속성에 자료형(type) 을 강제하는 것
export default interface IDept {
    dno?: any | null,
    dname: string,
    loc: string,
}