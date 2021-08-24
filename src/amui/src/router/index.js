import Vue from 'vue'
import VueRouter from 'vue-router'


import DetailVue from '../views/Detail.vue'
import Main from '../views/Main.vue'
import AdminMainVue from '../views/AdminMain.vue'
import AdminNoticeVue from '../views/AdminNotice.vue'
import AdminProductVue from '../views/AdminProduct.vue'
import CusManagementVue from '../views/CusManagement.vue'
import AdminQnaVue from '../views/AdminQna.vue'

Vue.use(VueRouter)

const routes = [
  // 혜수언니
  {
    path: '/',
    name: 'Main',
    component: Main
<<<<<<< HEAD
},
=======
  },
>>>>>>> origin/daeun
  {
    path: '/detail',
    name: 'detail',
    component: DetailVue,
    // children: [
    //           {
    //         path: '/info',
    //         name: 'Info',
    //         component: InfoVue
    //     },
    //     {
    //         path: '/reviews',
    //         name: 'reviews',
    //         component: ReviewsVue
    //     },
    //     {
    //         path: '/qna',
    //         name: 'qna',
    //         component: QnAVue
    //       }
    //     ]
  },
  
  // 정민언니
  {
    path: '/login',
    name: 'Login',
    component: () => import(/* webpackChunkName: "about" */ '../views/Login.vue')
  },
  {
    path: '/join',
    name: 'Join',
    component: () => import(/* webpackChunkName: "about" */ '../views/Join.vue')
  },

  {
  path: '/adminMain',
  name: 'AdminMain',
  component: AdminMainVue
  },
  {
    path: '/adminNotice',
    name: 'AdminNotice',
    component: AdminNoticeVue
  },
  {
    path: '/adminProduct',
    name: 'AdminProduct',
    component: AdminProductVue
  },
  {
    path: '/cusManagement',
    name: 'CusManagement',
    component: CusManagementVue
  },
  {
    path: '/adminQna',
    name: 'AdminQna',
    component: AdminQnaVue
  },
]

const router = new VueRouter({
  routes
})

export default router
