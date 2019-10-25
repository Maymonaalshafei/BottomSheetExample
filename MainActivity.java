
        import androidx.appcompat.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.MenuItem;
        import android.widget.Toast;
        import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Objects.requireNonNull(getSupportActionBar()).setHomeAsUpIndicator(R.drawable.ic_menu);//
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



    }
    @Override
    public boolean onOptionsItemSelected( MenuItem item) {
    
        ItemListDialogFragment bottomSheetDialog= new ItemListDialogFragment();
        bottomSheetDialog.show(getSupportFragmentManager(),"bottomSheet");
        
                Toast.makeText(this, "click..!!", Toast.LENGTH_SHORT).show();

                return super.onOptionsItemSelected(item);

        }
    }
