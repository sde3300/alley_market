<template>
    <div class="container">
        <div class="jumbotron text-center">
            <h1>회원관리</h1>
        </div>
        <hr>
        <div class="row">
            <div class="col" id="square"><router-link to="/adminNoticeList" id="router">공지<br>사항</router-link></div>
            <div class="col" id="square"><router-link to="/adminProductStock" id="router">상품<br>관리</router-link></div>
            <div class="col" id="square"><router-link to="/cusManagement" id="router">회원<br>관리</router-link></div>
            <div class="col" id="square"><router-link to="/adminQna" id="router">문의<br>관리</router-link></div>
        </div>
    </div>
</template>

<script>
export default {
    
}
</script>

<style>
#square {
    height: 250px;
    margin: 50px 20px 100px 20px;
    /* margin-top: 50px; */
    /* margin-bottom: 100px; */
    padding: 100px 100px;
    background-color: rgb(93, 141, 91);
    color: white;

    /* font-size: large; */
    /* font-weight: bolder; */
    text-align: text-center-y;
}
#router {
    color: white;
    font-size: 20px;
    font-weight: bolder;
    text-decoration: none;
}
</style>