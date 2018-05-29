package siopa.ashu.androidsiopaserver.Service;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

import siopa.ashu.androidsiopaserver.Common.Common;
import siopa.ashu.androidsiopaserver.Model.Token;

/**
 * Created by DELL on 5/28/2018.
 */

public class MyFirebaseIdService extends FirebaseInstanceIdService {
    @Override
    public void onTokenRefresh() {
        super.onTokenRefresh();
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        updateToServer(refreshedToken);
    }

    private void updateToServer(String refreshedToken) {
        FirebaseDatabase db = FirebaseDatabase.getInstance();
        DatabaseReference tokens = db.getReference("Tokens");
        Token data = new Token(refreshedToken,true);
        tokens.child(Common.currentUser.getPhone()).setValue(data);
    }
}
