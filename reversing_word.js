function reversword(sentence){
    const word = sentence.split(' ');
    const reversword=word.map(word=>{
        const revesed=word.split('').reverse().join('');
        return revesed;
    });
    const revesedsentence=reversword.join(' ');
    return revesedsentence;
}

const inputsentence="This is a sunny day"
const revesedsentence=reversword(inputsentence)
console.log(revesedsentence)