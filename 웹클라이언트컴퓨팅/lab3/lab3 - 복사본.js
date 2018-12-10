const memberObj = [
  {
    name: '홍길동',
    weight: 86,
    rrid: '960330-1306548',

  },
  {
    name: '김철수',
    weight: 63,
    rrid: '050810-3306548'
  },
  {
    name: '오영희',
    weight: 48,
    rrid: '030702-4138926'
  },
  {
    name: '윤명숙',
    weight: 43,
    rrid: '030302-2306548'
  },
  {
    name: '이하나',
    weight: 52,
    rrid: '980330-2306548'
  }
];

const fs = require('fs');
// 파일을 씁니다.
fs.writeFileSync('member.json', memberObj);



// 모듈을 추출합니다.
const fs = require('fs');
// 파일을 읽어 들이고 출력합니다.
const file = fs.readFileSync('lab3_log.txt');
console.log(file.toString());
