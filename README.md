# DialogDemo
自定义对话框
构造函数有两种,一种是带有标题的,可以自定义标题 第二种带有编辑框的.可以设置其确定/取消的按钮.
使用是DialogUtils. DialogUtil.createComfirmDialog(this); 或者DialogUtil.createOnlyTitleComfirmDialog(this);
 设置了按钮的监听,表示有两个按钮,默认否/是.
 
 需要修改按钮的话
    comfirmDialog.setNegativeButtonText("取消");
    comfirmDialog.setPositiveButtonText("确定");
    还可以设置标题
    comfirmDialog.setDialogTitle("标题");