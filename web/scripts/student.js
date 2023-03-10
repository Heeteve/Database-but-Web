//通过bootstrap Table方法refresh重新加载数据
function showData() {
    $('#tableList').bootstrapTable('refresh');
}

//官方使用方法的语法：<code>$('#table').bootstrapTable('method', parameter)</code>
$('#tableList').bootstrapTable({
    url: 'studentList.action', //请求后台的URL（*）
    method: 'get', //请求方式（*）
    toolbar: '#toolbar', //工具按钮用哪个容器
    striped: true, //是否显示行间隔色
    cache: false, //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
    pagination: true, //是否显示分页（*）
    sortable: false, //是否启用排序
    sortOrder: "asc", //排序方式
    queryParams: function (params) {
        return {
            pageSize: params.limit, //每页多少条数据
            offset: params.offset, //请求第几页
            sort: params.sort, //排序列名
            sortOrder: params.order //排位命令（desc，asc）
        };
    }, //传递参数（*）
    sidePagination: "server", //分页方式：client客户端分页，server服务端分页（*）
    pageNumber: 1, //初始化加载第一页，默认第一页
    pageSize: 10, //每页的记录行数（*）
    pageList: [10, 25, 50, 100], //可供选择的每页的行数（*）
    search: false, //是否显示表格搜索，此搜索是客户端搜索，不会进服务端，所以，个人感觉意义不大
    strictSearch: true,
    showColumns: true, //是否显示所有的列
    showRefresh: true, //是否显示刷新按钮
    minimumCountColumns: 2, //最少允许的列数
    clickToSelect: true, //是否启用点击选中行
    height: 500, //行高，如果没有设置height属性，表格自动根据记录条数觉得表格高度
    uniqueId: "ID", //每一行的唯一标识，一般为主键列
    showToggle: true, //是否显示详细视图和列表视图的切换按钮
    cardView: false, //是否显示详细视图
    detailView: false, //是否显示父子表
    columns: [{
        checkbox: true
    }, {
        field: 'id',
        title: '学生编号'
    }, {
        field: 'name',
        title: '学生姓名'
    }
    ]
});