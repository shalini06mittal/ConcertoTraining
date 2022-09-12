describe('testing Greet Function',()=>{
    // executes only befor every test case
    beforeEach(()=>{
        console.log('before each')
    })
    afterEach(()=>{
        console.log('after each')
    })
    // it = test cases
    it('greet returns "Hi"',()=>{
        console.log('first test case')
        expect(greet()).toBe('Hii')
    })
    it('second failed test case',()=>{
        console.log('second test case')
        expect(4).toBe(4)
    })
})

// describe('testing Greet Function 2',()=>{
//     it('first test case',()=>{
//         expect(true).toBe(true)
//     })
//     it('second failed test case',()=>{
//         expect(4).toBe(4)
//     })
// })