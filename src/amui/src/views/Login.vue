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
                    <input type="email" class="form-control" id="exampleFormControlInput1" placeholder="name@example.com"  v-model="customerEmail">
                    </div>
                </div>
                <div class="form-group row">
                    <label for="inputPassword" class="col-sm-3 col-form-label">비밀번호</label>
                    <div class="col-sm-9">
                    <input type="password" class="form-control" id="inputPassword" placeholder="****"  v-model="customerPw">
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
                <button type="button" class="btn btn  btn-lg btn-block" id="btnlo" v-on:click="login">로그인</button><br>
                <button type="button" class="btn btn-secondary  btn-lg btn-block" id="btnjo" v-on:click="join">회원가입</button>
                </div>
            </form>
        </div>
    </div>
</template>

<script>
import eventBus from '../plugins/eventBus'

export default {
    data() {
        return {
            customerEmail:'',
            customerPw:'',
            customerPk:0, 
            customerName:'',
        }
    },
    methods: {
        login() {
            let obj = this;

            this.$axios.post("http://localhost:9000/login", {
                customerEmail: this.customerEmail,
                customerPw: this.customerPw,
                customerPk: this.customerPk,
                customerName: this.customerName,
            })
            .then(function(res) {
                console.log("axios로 비동기 통신 성공");

                if (res.data.customerEmail != null) {
                    sessionStorage.setItem('customerEmail', res.data.customerEmail);
                    sessionStorage.setItem('adminYn', res.data.adminYn);
                    sessionStorage.setItem('customerPk', res.data.customerPk);
                    sessionStorage.setItem('customerName', res.data.customerName);
                    if (res.data.adminYn == 'Y') {
                        alert("관리자로 로그인되었습니다.");
                        obj.$router.push({ name : "AdminMain"});
                        eventBus.$emit('adminLogin', true);
                        }
                    else {
                        alert("로그인되었습니다. 환영합니다!");
                        obj.$router.push({ name : "Index"});
                        eventBus.$emit('cusLogin', true);
                    }
                }
                else {
                    alert("이메일이나 비밀번호를 다시입력해주세요.");
                    obj.customerEmail = '';
                    obj.customerPw = '';
                }
            })
            .catch(function(err) {
                console.log("axios 비동기 통신 오류");
                console.log(err);
            });
        },
        
        join() {
            this.$router.push({
                name: "Join",
            });
        },
    }
}
</script>

<style scoped>
#loginform {
    margin-top: 40px;
    width: 70%;
    /* border: 1px solid lightgray; */
    border-radius: 20px;
    padding: 50px;
    margin-bottom: 40px;
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
.form-check {
    margin-top: 20px;
    margin-bottom: 20px;
}
</style>