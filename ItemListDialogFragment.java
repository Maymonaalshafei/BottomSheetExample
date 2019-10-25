
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


public class ItemListDialogFragment extends BottomSheetDialogFragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.bottom_sheet, container, false);

        v.findViewById(R.id.savedItem).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "saved items ", Toast.LENGTH_LONG).show();

            }
        });
        v.findViewById(R.id.yourInbox).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "your InBox ", Toast.LENGTH_LONG).show();

            }
        });
        v.findViewById(R.id.share).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "share ", Toast.LENGTH_LONG).show();

            }
        });
        v.findViewById(R.id.settings).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "settings ", Toast.LENGTH_LONG).show();

            }
        });


        return v;
    }

}
