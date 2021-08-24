import Vue from 'vue'
import VueRouter from 'vue-router'
import InfoVue from '../views/Info.vue'
import ReviewsVue from '../views/Reviews.vue'
import QnAVue from '../views/QnA.vue'
import DetailVue from '../views/Detail.vue'
import Main from '../views/Main.vue'

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
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () => import(/* webpackChunkName: "about" */ '../views/Login.vue')
  },
  {
    path: '/join',
    name: 'Join',
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () => import(/* webpackChunkName: "about" */ '../views/Join.vue')
  }
]

const router = new VueRouter({
  routes
})

export default router
