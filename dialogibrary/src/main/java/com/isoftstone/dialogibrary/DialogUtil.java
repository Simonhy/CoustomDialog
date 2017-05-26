package com.isoftstone.dialogibrary;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * 自定义对话框
 */
public class DialogUtil {
    public static CustomDialog createComfirmDialog(Context context) {
        return new CustomDialog(context, R.style.Dialog, 0);
    }

    public static CustomDialog createOnlyTitleComfirmDialog(Context context) {
        return new CustomDialog(context, R.style.Dialog, 1);
    }

    public static class CustomDialog extends Dialog {

        private Button positiveButton, negativeButton;
        private TextView tv_title, tv_content;


        public CustomDialog(Context context, int theme, int dialogType) {
            super(context, theme);
            initDialog(context, dialogType);
        }

        public CustomDialog(Context context, int dialogType) {
            super(context);
            initDialog(context, dialogType);
        }

        private void initDialog(Context context, int dialogType) {
            setCancelable(false);
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View layout = inflater.inflate(R.layout.common_confirm_dialog_view, null);
            positiveButton = (Button) layout.findViewById(R.id.positiveButton);
            negativeButton = (Button) layout.findViewById(R.id.negativeButton);
            positiveButton.setVisibility(View.GONE);
            negativeButton.setVisibility(View.GONE);
            tv_title = (TextView) layout.findViewById(R.id.tv_title);
            tv_content = (TextView) layout.findViewById(R.id.tv_content);
            switch (dialogType) {
                case 0:
                    //普通提示框
                    break;
                case 1:
                    //只有title没有content
                    tv_title.setHeight(UIUtils.dp2px(context, 120));
                    tv_content.setVisibility(View.GONE);
                    break;
            }
            this.addContentView(layout, new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.MATCH_PARENT));
            this.setContentView(layout, new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.MATCH_PARENT));

        }

        public CustomDialog setNegativeButtonListener(View.OnClickListener listener) {
            negativeButton.setVisibility(View.VISIBLE);
            negativeButton.setOnClickListener(listener);
            return this;
        }

        public CustomDialog setPostiveButtonListener(View.OnClickListener listener) {
            positiveButton.setVisibility(View.VISIBLE);
            positiveButton.setOnClickListener(listener);
            return this;
        }

        public CustomDialog setDialogTitle(String dialogTitle) {
            tv_title.setText(dialogTitle);
            return this;
        }

        public CustomDialog setDialogContent(String dialogContent) {
            tv_content.setText(dialogContent);
            return this;
        }

        public CustomDialog setPositiveButtonText(String buttonText) {
            positiveButton.setText(buttonText);
            return this;
        }

        public CustomDialog setNegativeButtonText(String buttonText) {
            negativeButton.setText(buttonText);
            return this;
        }

//		public String getEditText() {
//			return editText.getText().toString();
//		}

    }

}

