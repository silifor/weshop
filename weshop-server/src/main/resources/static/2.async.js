(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([[2],{Z1zc:function(e,t,a){"use strict";var n=a("xK3H");Object.defineProperty(t,"__esModule",{value:!0}),t.default=void 0;var r=n(a("SeLb")),u=n(a("fh3l")),c=a("dCQc"),s={namespace:"collect",state:{data:{list:[],pagination:{}}},effects:{list:u.default.mark(function e(t,a){var n,r,s,l;return u.default.wrap(function(e){while(1)switch(e.prev=e.next){case 0:return n=t.payload,r=a.call,s=a.put,e.next=4,r(c.queryCollect,n);case 4:return l=e.sent,e.next=7,s({type:"queryList",payload:l});case 7:case"end":return e.stop()}},e,this)})},reducers:{queryList:function(e,t){return(0,r.default)({},e,{data:t.payload.data})}}};t.default=s}}]);