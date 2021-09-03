<template>
    <div class="header">
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <!-- <span style="font-size: 1.5em;"><i class="fas fa-truck" v-on:click="moveMain"></i></span> <a class="navbar-brand" href="#" v-on:click="moveMain"> 골목시장</a> -->
        <span style="font-size: 1.5em;"><router-link to="/" id="routerlink"><i class="fas fa-truck"> 골목시장</i></router-link></span> 
        <!-- <a class="navbar-brand" href="#"> 골목시장</a> -->
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav ml-auto">
            <!-- <li class="nav-item active">
                <a class="nav-link" href="#">전체상품 <span class="sr-only">(current)</span></a>
            </li> -->
            <li class="nav-item">
                <a class="nav-link"><router-link to="/adminMain" id="routerlink">관리자(임시)</router-link></a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#" @click="moveNoticeList">공지사항</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#" @click="moveLogin">로그인</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#" @click="moveJoin">회원가입</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#" @click="moveMypage">마이페이지</a>
            </li>
            </ul>
        </div>
        </nav>
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <!-- <a class="navbar-brand" href="#">Navbar</a> -->
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item active">
                    <!-- <a class="nav-link" href="#" v-on:click="moveMain">전체상품 <span class="sr-only">(current)</span></a> -->
                    <a class="nav-link" href="#/main">전체상품 <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#/p1board">밀키트</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#/p2board">농/수산물</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#/p3board">축산물</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#/p4board">식품</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#/p5board">기타</a>
                </li>
            </ul>
            <form class="form-inline my-2 my-lg-0">
                <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
                &nbsp; &nbsp; &nbsp;
                <span style="font-size: 2em; ">
                    <i id="cart" class="fas fa-shopping-cart" href="#" v-on:click="moveCart"></i>
                </span>
            </form>
        </div>
        </nav>
        <hr>
    </div>
</template>

<script>
export default {
    data() {
        return {

        };
    },
    methods: {
        // moveMain () {
        //     this.$router.push({
        //         name: "Main",
        //     });
        // },
        moveLogin () {
            this.$router.push({
                name: "Login",
            });
        },
        moveJoin () {
            this.$router.push({
                name: "Join",
            });
        },
        moveNoticeList () {
            this.$router.push({
                name: "NoticeList",
            });
        },
        moveCart (customerPk) {
            this.$router.push({
                name: "CartList",
                query: { customerPk: customerPk },
            });
        },
        moveMypage (customerPk) {
            this.$router.push({
                name: "Mypage",
                query: { customerPk: customerPk },
            });
        },

    },
    mounted() {

    },
}
</script>

<style scoped>
/* router-link {
    color: black;
} */
/* #router {
    color: rgb(62, 64, 68);
} */
#cart {
    margin-left: 10px;
}
</style>