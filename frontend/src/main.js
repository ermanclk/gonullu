import Vue from 'vue'
import App from './App.vue'
import router from './router'
import BootstrapVue from 'bootstrap-vue'
import 'bootstrap/dist/css/bootstrap.css'
import 'bootstrap-vue/dist/bootstrap-vue.css'
import store from './store'

import Vuelidate from 'vuelidate';

// Bootstrap
Vue.use(BootstrapVue);
// Vuelidate
Vue.use(Vuelidate);

new Vue({
    router,
    store,
    render: h => h(App)
}).$mount('#app');

