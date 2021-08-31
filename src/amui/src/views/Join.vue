<template>
    <div class="container">
        <div class="jumbotron text-center">
            <h1>회원가입</h1>
        </div>
        <div class="container" id="joinform">
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
                    <label class="form-check-label" for="exampleCheck1">회원가입을 위한 개인정보제공에 동의합니다.</label>
                </div>
                <button type="submit" class="btn btn" id="btnjoin">가입하기</button>
            </form>
        </div>
    </div>
</template>

<script>
export default {
    
}
</script>

<style scoped>
#joinform {
    margin-top: -50px;
    width: 70%;
    /* border: 1px solid lightgray; */
    border-radius: 20px;
    padding: 50px;
}
#btnjoin {
    background-color: rgb(93, 141, 91);
    color: white;
    border-radius: 50px;
}
</style>