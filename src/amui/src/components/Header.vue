<template>
    <div class="header">
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <span style="font-size: 1.5em;"><i class="fas fa-truck" v-on:click="moveMain"></i></span> <a class="navbar-brand" href="#" v-on:click="moveMain"> 골목시장</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav ml-auto">
            <!-- <li class="nav-item active">
                <a class="nav-link" href="#">전체상품 <span class="sr-only">(current)</span></a>
            </li> -->
            <li class="nav-item">
                <a class="nav-link" href="#">공지사항</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">로그인</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">회원가입</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#" v-on:click="moveMypage">마이페이지</a>
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
                    <a class="nav-link" href="#" v-on:click="moveMain">전체상품 <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">밀키트</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">농/수산물</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">축산물</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">식품</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">기타</a>
                </li>
            </ul>
            <form class="form-inline my-2 my-lg-0">
                <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
                &nbsp; &nbsp; &nbsp;
                <span style="font-size: 2em;">
                    <i class="fas fa-shopping-cart" href="#" v-on:click="moveCart"></i>
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
        moveMain () {
            this.$router.push({
                name: "Main",
            });
        },
        moveCart (customerPk) {
            this.$router.push({
                name: "CartList",
                query: { customerPk: customerPk },
            });
        },
        moveMypage () {
            this.$router.push({
                name: "Mypage",
            });
        },
    },
    mounted() {

    },
}
</script>

<style scoped>

</style>