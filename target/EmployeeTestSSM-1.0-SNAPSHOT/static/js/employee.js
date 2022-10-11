
var vue = new Vue({
    "el":"#app",
    methods:{
        deleteEmp(){
            var form = document.getElementsByTagName("form")[0];
            form.action = event.target.href;
            //执行
            form.submit();
            // 阻止原生标签的操作
            event.preventDefault();
        },
        checkAll(){
            var oall=document.getElementById("all");
            var oid=document.getElementsByName("id");
            oall.onclick = function(){//勾选全选时
                for(var i=0;i<oid.length;i++){
                    //所有的选择框和全选一致
                    oid[i].checked=oall.checked;
                }
            };
        },
        deleteEmps(){
            var oid = document.getElementsByName("id");
            var ids = "";
            var num = 0;
            for(var i=0;i<oid.length;i++){
                if(oid[i].checked==true){
                    if(num == 0){
                        ids = ids + "ids="+oid[i].value
                    }else{
                        ids = ids + "&ids="+oid[i].value
                    }
                    num++;
                }
            }
            axios.post(
                "/ssm/employee/deleteEmps",
                ids
            ).then(response=>{
                if(response.data.includes("ok")){
                    var pageNum = response.data.slice(2)
                    console.log("pageNum:" + pageNum)
                    alert("删除成功")
                    // 调用action刷新页面
                    location.reload();
                }else{
                    alert("删除失败")
                }
            })
        }
    }
})


//全选




