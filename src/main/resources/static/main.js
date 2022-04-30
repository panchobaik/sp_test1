
let element = document.getElementById('test');

function toggle() {
    //toggle할때마다, class="tes-class"를 <div id="test"> 추가 또는 제거
	element.classList.toggle('test-class'); 
}

function add() {
    // add 실행시, class="tes-class"를 <div id="test"> 추가
	element.classList.add('test-class');
}

function remove() {
    // remove 실행시, class="tes-class"를 <div id="test"> 제거
	element.classList.remove('test-class');
}