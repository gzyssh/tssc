layui.define(['admin','element','table','jquery'], function(exports){
    var $ = layui.$
        ,admin = layui.admin
        ,view = layui.view
        ,laypage = layui.laypage
        ,layer = layui.layer;
    laypage.render({
        elem: 'demo0'
        ,count: 50 //数据总数
    });
    exports('book/list', {})
});
