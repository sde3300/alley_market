<template>
    <div class="container">
        <div class="jumbotron text-center">
            <h1>회원가입</h1>
        </div>
        <div class="container" id="join">
            <form>
            <div class="form-group">
                <label for="name">이름</label>
                <input type="text" class="form-control" id="exampleInputName" aria-describedby="nameHelp" placeholder="이름을 입력하세요">
            </div>
            <div class="form-group">
                <label for="phone">전화번호</label>
                <input type="tel" class="form-control" id="exampleInputPhone" aria-describedby="phoneHelp" placeholder="전화번호를 입력하세요">
            </div>
            <div class="form-group">
                <label for="exampleInputEmail1">이메일</label>
                <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="이메일을 입력하세요">
            </div>
            <div class="form-group">
                <label for="exampleInputPassword1">비밀번호</label>
                <input type="password" class="form-control" id="exampleInputPassword1" placeholder="******">
            </div>
            <div class="form-group">
                <label for="exampleInputPassword1">비밀번호 확인</label>
                <input type="password" class="form-control" id="exampleInputPassword2" placeholder="******">
            </div>
            <div class="form-group form-check">
                <input type="checkbox" class="form-check-input" id="exampleCheck1">
                <label class="form-check-label" for="exampleCheck1">Check me out</label>
            </div>
            <button type="submit" class="btn btn-primary">가입하기</button>
</form>
        </div>
    </div>
</template>

<script>
export default {
    
}
</script>

<style scoped>

</style>