package br.com.etecia.appinsta;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ProfileAdapterHorizontal extends RecyclerView.Adapter<ProfileAdapterHorizontal.ViewHolder> {
    private Context mContexto;
    private List<ProfileHor> lstProfileHor;

    public ProfileAdapterHorizontal(Context mContexto, List<ProfileHor> lstProfileHor) {
        this.mContexto = mContexto;
        this.lstProfileHor = lstProfileHor;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;

        LayoutInflater inflater = LayoutInflater.from(mContexto);
        view = inflater.inflate(R.layout.modelo_profile_home_horizontal, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.story.setText(lstProfileHor.get(position).getStory());
        holder.imgProfile.setImageResource(lstProfileHor.get(position).getImagem());


    }

    @Override
    public int getItemCount() {
        return lstProfileHor.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView story;
        ImageView imgProfile;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            story = itemView.findViewById(R.id.txtProfileH);
            imgProfile = itemView.findViewById(R.id.imgProfileH);

        }
    }
}
