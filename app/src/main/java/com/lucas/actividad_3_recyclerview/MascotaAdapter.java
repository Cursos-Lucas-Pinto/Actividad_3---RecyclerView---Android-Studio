package com.lucas.actividad_3_recyclerview;

import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MascotaAdapter  extends RecyclerView.Adapter <MascotaAdapter.AdaptadorViewHolder> {
    List <Mascota> mascotaList;

    @Override
    public AdaptadorViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout, parent, false);
        return new AdaptadorViewHolder(view);
    }

    @Override
    public void onBindViewHolder(AdaptadorViewHolder holder, int position) {
        holder.imagen.setImageResource(mascotaList.get(position).getImagen());
        holder.nombre.setText(mascotaList.get(position).getNombre());
        holder.numLikes.setText(Integer.toString(mascotaList.get(position).getNumLikes()));
    }

    public MascotaAdapter (List mascotas) {
        this.mascotaList = mascotas;
    }
    @Override
    public int getItemCount() {
        return mascotaList.size();
    }

    public static class AdaptadorViewHolder extends RecyclerView.ViewHolder {
        public ImageView imagen;
        public TextView nombre;
        public TextView numLikes;

        public AdaptadorViewHolder(View itemView) {
            super(itemView);
            this.imagen = (ImageView) itemView.findViewById(R.id.imagenMascota);
            this.nombre = (TextView) itemView.findViewById(R.id.nombreMascota);
            this.numLikes = (TextView) itemView.findViewById(R.id.numLikesMascota);
        }
    }
}
