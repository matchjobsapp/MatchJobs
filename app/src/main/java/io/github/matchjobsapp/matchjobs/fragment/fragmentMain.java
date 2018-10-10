package io.github.matchjobsapp.matchjobs.fragment;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;
import io.github.matchjobsapp.matchjobs.R;

public class fragmentMain extends AppCompatActivity {

    private BottomNavigationView mainNav;
    private FrameLayout mainFrame;
    private Fragment_MatchRecrutador matchFrame;
    private Fragment_ChatR chatFrame;
    private Fragment_CurriculoR curriculoFrame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_main);

        mainNav =  findViewById(R.id.bottom_navigationId);
        mainFrame =  findViewById(R.id.mainFrameId);
        matchFrame = new Fragment_MatchRecrutador();
        chatFrame = new Fragment_ChatR();
        curriculoFrame = new Fragment_CurriculoR();
        setFragment(matchFrame);

        mainNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem Item) {
                switch(Item.getItemId())
                {
                    case R.id.action_match:
                        setFragment(matchFrame);
                        return true;
                    case R.id.action_chat:
                        setFragment(chatFrame);
                        return true;
                    case R.id.action_config:
                        setFragment(curriculoFrame);
                        return true;
                    default : return false;
                }
            }

        });
    }

    public void setFragment(android.support.v4.app.Fragment fragment){
        android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.mainFrameId, fragment);
        fragmentTransaction.commit();
    }


}
