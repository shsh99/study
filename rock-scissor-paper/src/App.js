import { useState } from 'react';
import Button from './Button';
import HandButton from './HandButton';
import HandIcon from './HandIcon';
import { compareHand, generateRandomHand } from './utils';

function getResult(me, other) {
  const comparison = compareHand(me, other);
  if (comparison > 0) return '승리';
  if (comparison < 0) return '패배';
  return '무승부';
}

function App() {
  // hand와 otherHand를 state로 바꿔 주세요
  const [hand,setHand] = useState('rock');
  const [otherHand, setOtherHand] = useState('rock');

  const handleButtonClick = (nextHand) => {
    const nextOtherHand = generateRandomHand();
    setHand(nextHand);
    setOtherHand(nextOtherHand);
    // hand의 값을 nextHand 로 바꿔 주세요
    // otherHand의 값을 generateRandomHand()의 리턴 값으로 바꿔주세요
  };

  const handleClearClick = () => {
    setHand('rock');
    setOtherHand('rook')
    // hand와 otherHand의 값을 'rock' 으로 바꿔주세요
  };

  return (
    <div>
      <Button onClick={handleClearClick}>처음부터</Button>
      <p>{getResult(hand, otherHand)}</p>
      <div>
        <HandIcon value={hand} />
        VS
        <HandIcon value={otherHand} />
      </div>
      <div>
        <HandButton value="rock" onClick={handleButtonClick} />
        <HandButton value="scissor" onClick={handleButtonClick} />
        <HandButton value="paper" onClick={handleButtonClick} />
      </div>
    </div>
  );
}

export default App;
