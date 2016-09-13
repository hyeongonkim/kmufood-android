package net.sproutlab.kmufood.dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;

import net.sproutlab.kmufood.R;

/**
 * Created by kde713 on 2016. 9. 7..
 */
public class FeedbackDialog extends Dialog implements View.OnClickListener {

    Context c;

    public FeedbackDialog(Context context) {
        super(context);
        this.c = context;
        setContentView(R.layout.dialog_feedback);

        findViewById(R.id.btn_contact_kakaotalk).setOnClickListener(this);
        findViewById(R.id.btn_contact_email).setOnClickListener(this);
        findViewById(R.id.btn_contact_facebook).setOnClickListener(this);
        findViewById(R.id.btn_close).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_contact_kakaotalk:
                c.startActivity(new Intent(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("http://plus.kakao.com/home/@sprout"))));
                dismiss();
                break;
            case R.id.btn_contact_email:
                c.startActivity(new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:admin@sproutlab.net")));
                dismiss();
                break;
            case R.id.btn_contact_facebook:
                c.startActivity(new Intent(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://www.facebook.com/sproutlab.net/"))));
                dismiss();
                break;
            case R.id.btn_close:
                dismiss();
                break;
        }
    }
}