<template>   
    <main>
        <section class="jumbotron text-center">
                    <div class="d-flex bg-dark">
                        <router-link to="/" class="flex-fill text-white text-decoration-none py-3 px-4 router-link" v-bind:class="{ 'bg-danger' : isInfo }">물품정보</router-link>
                        <router-link to="/reviews" class="flex-fill text-white text-decoration-none py-3 px-4 router-link" v-bind:class="{ 'bg-danger' : isReviews }">이용후기</router-link>
                        <router-link to="/qna" class="flex-fill text-white text-decoration-none py-3 px-4 router-link" v-bind:class="{ 'bg-danger' : isQnA }">물품문의</router-link>
                    </div>
                    <div>
                        <router-view></router-view>
                    </div>
        </section>
    </main>
</template>


<script>
export default {
    

}
</script>

<style>

</style>

