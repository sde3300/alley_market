import Vue from 'vue'
import VueRouter from 'vue-router'
import InfoVue from '../views/Info.vue'
import ReviewsVue from '../views/Reviews.vue'
import QnAVue from '../views/QnA.vue'
import DetailVue from '../views/Detail.vue'
import Main from '../views/Main.vue'
import Login from '../views/Login.vue'
import Join from '../views/Join.vue'
import ReviewWrite from '../views/ReviewWrite.vue'
import QnAWrite from '../views/QnAWrite.vue'
import NoticeWrite from '../views/NoticeWrite.vue'
import Mypage from '../views/Mypage.vue'

Vue.use(VueRouter)

const routes = [
  // 혜수언니
  {
    path: '/',
    name: 'Main',
    component: Main
},
//   {
//     path: '/',
//     name: 'Info',
//     component: InfoVue
// },
//   {
//       path: '/info',
//       name: 'Info',
//       component: InfoVue
//   },
// {
//     path: '/reviews',
//     name: 'reviews',
//     component: ReviewsVue
// },
// {
//     path: '/qna',
//     name: 'qna',
//     component: QnAVue
//   },
  {
    path: '/detail',
    name: 'detail',
    component: DetailVue,
    children: [
              {
            path: '/info',
            name: 'Info',
            component: InfoVue
        },
        {
            path: '/reviews',
            name: 'reviews',
            component: ReviewsVue
        },
        {
            path: '/qna',
            name: 'qna',
            component: QnAVue
          }
        ]
  },
  
  // 정민언니
  {
    path: '/login',
    name: 'Login',
    component: Login
  },
  {
    path: '/join',
    name: 'Join',
    component: Join
  },
  {
    path: '/reviewWrite',
    name: 'ReviewWrite',
    component: ReviewWrite
  },
  {
    path: '/qnaWrite',
    name: 'QnAWrite',
    component: QnAWrite
  },
  {
    path: '/noticeWrite',
    name: 'NoticeWrite',
    component: NoticeWrite
  },
  {
    path: '/mypage',
    name: 'Mypage',
    component: Mypage
  }
]

const router = new VueRouter({
  routes
})

export default router
