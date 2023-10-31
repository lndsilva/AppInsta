package br.com.etecia.appinsta;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.ViewHolder> {

    private Context mContexto;
    private List<HomeContents> lstHomeContent;

    public HomeAdapter(Context mContexto, List<HomeContents> lstHomeContent) {
        this.mContexto = mContexto;
        this.lstHomeContent = lstHomeContent;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;

        LayoutInflater inflater = LayoutInflater.from(mContexto);
        view = inflater.inflate(R.layout.modelo_home_card, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.idTituloHome.setText(lstHomeContent.get(position).getTitulo());
        holder.idSubTituloHome.setText(lstHomeContent.get(position).getSubtitulo());
        holder.idImagemHome.setImageResource(lstHomeContent.get(position).getImagem());

    }

    @Override
    public int getItemCount() {
        return lstHomeContent.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView idTituloHome;
        TextView idSubTituloHome;
        ImageView idImagemHome;
        CardView idCardHome;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            idTituloHome = itemView.findViewById(R.id.txtTituloHomeProfile);
            idSubTituloHome = itemView.findViewById(R.id.txtSubHomeProfile);
            idImagemHome = itemView.findViewById(R.id.imagemHomeProfile);
        }
    }


}
