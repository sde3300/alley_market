<template>
    <div class="container">
        <div class="jumbotron text-center">
            <h1>로그인</h1>
        </div>
        <div class="container" id="loginform">
            <form>
                <div class="form-group row ">
                    <label for="staticEmail" class="col-sm-3 col-form-label">이메일</label>
                    <div class="col-sm-9">
                    <input type="email" class="form-control" id="exampleFormControlInput1" placeholder="name@example.com">
                    </div>
                </div>
                <div class="form-group row">
                    <label for="inputPassword" class="col-sm-3 col-form-label">비밀번호</label>
                    <div class="col-sm-9">
                    <input type="password" class="form-control" id="inputPassword" placeholder="****">
                    </div>
                </div>
                <!-- <div class="form-group row">
                    <label for="inputPassword" class="col-sm-3 col-form-label">비밀번호 확인</label>
                    <div class="col-sm-9">
                    <input type="password" class="form-control" id="inputPassword" placeholder="****">
                    </div>
                </div> -->
                <div class="form-check form-check-inline">
                    <input class="form-check-input" type="checkbox" id="inlineCheckbox1" value="option1">
                    <label class="form-check-label" for="inlineCheckbox1">아이디저장</label>
                </div>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" type="checkbox" id="inlineCheckbox2" value="option2">
                    <label class="form-check-label" for="inlineCheckbox2">로그인유지</label>
                </div>
                <div id="btn">
                <button type="button" class="btn btn  btn-lg btn-block" id="btnlo">로그인</button><br>
                <button type="button" class="btn btn-secondary  btn-lg btn-block" id="btnjo">회원가입</button>
                </div>
            </form>
        </div>
    </div>
</template>

<script>
export default {
    
}
</script>

<style scoped>
#loginform {
    margin-top: -50px;
    width: 70%;
    /* border: 1px solid lightgray; */
    border-radius: 20px;
    padding: 50px;
}
#btn {
    margin: 20px 0px;
}
.form-group {
    margin-top: 10px;
}
/* #formCheck {
    margin: auto;
} */
#btnlo {
    background-color: rgb(93, 141, 91);
    color: white;
    border-radius: 50px;
}
#btnjo {
    background-color: rgb(106, 110, 105);
    color: white;
    border-radius: 50px;
}
</style>