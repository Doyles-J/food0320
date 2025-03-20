
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import CustomerOrderManager from "./components/listers/CustomerOrderCards"
import CustomerOrderDetail from "./components/listers/CustomerOrderDetail"

import StoreCookingManager from "./components/listers/StoreCookingCards"
import StoreCookingDetail from "./components/listers/StoreCookingDetail"

import RiderDeliveryManager from "./components/listers/RiderDeliveryCards"
import RiderDeliveryDetail from "./components/listers/RiderDeliveryDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/customers/orders',
                name: 'CustomerOrderManager',
                component: CustomerOrderManager
            },
            {
                path: '/customers/orders/:id',
                name: 'CustomerOrderDetail',
                component: CustomerOrderDetail
            },

            {
                path: '/stores/cookings',
                name: 'StoreCookingManager',
                component: StoreCookingManager
            },
            {
                path: '/stores/cookings/:id',
                name: 'StoreCookingDetail',
                component: StoreCookingDetail
            },

            {
                path: '/riders/deliveries',
                name: 'RiderDeliveryManager',
                component: RiderDeliveryManager
            },
            {
                path: '/riders/deliveries/:id',
                name: 'RiderDeliveryDetail',
                component: RiderDeliveryDetail
            },



    ]
})
