<template>
    <div class="login mr-auto">
        <div class="jumbotron text-center">
            <h1>로그인</h1>
        </div>
        <div class="container">
            <form>
                <div class="form-group row ">
                    <label for="staticEmail" class="col-sm-2 col-form-label">이메일</label>
                    <div class="col-sm-10">
                    <input type="email" class="form-control" id="exampleFormControlInput1" placeholder="name@example.com">
                    </div>
                </div>
                <div class="form-group row">
                    <label for="inputPassword" class="col-sm-2 col-form-label">비밀번호</label>
                    <div class="col-sm-10">
                    <input type="password" class="form-control" id="inputPassword" placeholder="****">
                    </div>
                </div>
                <div class="form-group row">
                    <label for="inputPassword" class="col-sm-2 col-form-label">비밀번호 확인</label>
                    <div class="col-sm-10">
                    <input type="password" class="form-control" id="inputPassword" placeholder="****">
                    </div>
                </div>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" type="checkbox" id="inlineCheckbox1" value="option1">
                    <label class="form-check-label" for="inlineCheckbox1">아이디저장</label>
                </div>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" type="checkbox" id="inlineCheckbox2" value="option2">
                    <label class="form-check-label" for="inlineCheckbox2">로그인유지</label>
                </div>
                <div>
                <button type="button" class="btn btn-secondary  btn-lg btn-block">로그인</button><br>
                <button type="button" class="btn btn-secondary  btn-lg btn-block">회원가입</button>
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

</style>