<template>
    <div class="container">
        <div class="jumbotron text-center">
            <h1>회원가입</h1>
        </div>
        <div class="container" id="joinform">
            <form>
                <div class="form-group">
                    <label for="customerName">이름</label>
                    <input type="text" class="form-control" id="customerName" aria-describedby="nameHelp" placeholder="이름을 입력하세요" v-model="customerName">
                </div>

                <div class="form-group">
                    <label for="customerPhone">전화번호</label>
                    <input type="tel" class="form-control" id="customerPhone" aria-describedby="phoneHelp" placeholder="-를 제외하고 전화번호를 입력해주세요" v-model="customerPhone">
                </div>

                <div class="form-group">
                    <label for="customerEmail">이메일</label>
                    &nbsp;&nbsp;<button type="button" class="btn btn-sm" id="btnidcheck" v-on:click="idCheck">이메일 중복 확인</button>
                    <input type="email" class="form-control" id="customerEmail" aria-describedby="emailHelp" placeholder="이메일을 입력하세요" v-model="customerEmail">
                </div>

                <div class="form-group">
                    <label for="customerPw">비밀번호</label>
                    <input type="password" class="form-control" id="customerPw" placeholder="******" v-model="customerPw">
                </div>

                <div class="form-group">
                    <label for="customerPw">비밀번호 확인</label>
                    <input type="password" class="form-control" id="customerPw" placeholder="******">
                </div>

                <div class="form-group form-check">
                    <input type="checkbox" class="form-check-input" id="exampleCheck1">
                    <label class="form-check-label" for="exampleCheck1">회원가입을 위한 개인정보제공에 동의합니다.</label>
                </div>

                <button type="button" class="btn btn" id="btnjoin" v-on:click="join">가입하기</button>
            </form>
        </div>
    </div>
</template>

<script>
export default {
    data() {
        return {
            customerEmail: '',
            customerPw: '',
            customerName: '',
            customerPhone: '',
            adminYn: '',
            errors: [],
        }
    },
    methods: {
        validationCheck() {
            this.errors = [];
            if (this.customerEmail == '') {
                this.errors.push("이메일을 입력해주세요.");
            }

            if (this.customerPw == '') {
                this.errors.push("비밀번호를 입력해주세요.");
            }

            if (this.customerName == '') {
                this.errors.push("이름을 입력해주세요.");
            }

            if (this.customerPhone == '') {
                this.errors.push("휴대폰번호를 입력해주세요.");
            }

            if (this.errors.length > 0) {
                return true;
            }
            else {
                return false;
            }
        },

        join() {
            let obj = this;

            if (this.validationCheck() == false) {

                // obj.$axios.post('http://localhost:9000/join', {
                obj.$axios.post('http://18.222.233.235:9000/join', {
                customerEmail: this.customerEmail,
                customerPw: this.customerPw,
                customerName: this.customerName,
                customerPhone: this.customerPhone,
                adminYn: this.adminYn
                })
                .then(function() {
                    console.log('비동기 통신 성공');
                    obj.$router.push({ name: 'Main' });
                        alert("회원가입이 완료되었습니다! 로그인해주세요.");
                })
                .catch(function(err) {
                    console.log("비동기 통신 실패");
                    console.log(err);
                });
            }
            else {
                let errorResult = '';
                for (let i = 0; i < this.errors.length; i++) {
                    errorResult += this.errors[i] + '\n';
                }

                alert(errorResult);
            }
        },
        idCheck() {
            let obj = this;

            let emailVal = this.customerEmail;
            let regExp = /^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/i; // 검증에 사용할 정규식 변수 regExp에 저장
            if (emailVal.match(regExp) != null) {
                // obj.$axios.get('http://localhost:9000/idCheck', {
                obj.$axios.get('http://18.222.233.235:9000/idCheck', {
                    params: {
                        customerEmail: this.customerEmail
                    }
                })
                .then(function(res) {
                    // console.log('비동기 통신 성공');

                    if (res.data.result == true) {
                        alert("사용가능한 이메일입니다.");
                    }
                    else {
                        alert("이미 등록된 이메일입니다.");
                    }
                })
                .catch(function(err) {
                    console.log("비동기 통신 실패");
                    console.log(err);
                });
            }
            else {
                alert('이메일 형식으로 입력해주세요');
            }
        }
    },
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

#btnidcheck {
    background-color: rgb(106, 110, 105);
    border-radius: 50px;
    color: white;
}
</style>