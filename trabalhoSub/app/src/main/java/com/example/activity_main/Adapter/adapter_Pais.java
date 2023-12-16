package com.example.activity_main.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.activity_main.R;

import java.util.ArrayList;

import com.example.activity_main.Model.Pais;

public class adapter_Pais  extends RecyclerView.Adapter<adapter_Pais.ViewHolder> {

    private ArrayList<Pais> listaPaises;
    private LayoutInflater inflater;

    public adapter_Pais(Context context, ArrayList<Pais> listaPaises) {
        this.inflater = LayoutInflater.from(context);
        this.listaPaises = listaPaises;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.pises_lista, parent, false);
        return new ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Pais pais = listaPaises.get(position);

        holder.tvCodigo.setText(String.valueOf(pais.getCodigo()));
        holder.tvDescricao.setText(pais.getDescricao());
    }
    @Override
    public int getItemCount() {
        return listaPaises.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tvCodigo, tvDescricao;
        public ViewHolder(View itemView) {
            super(itemView);
            tvCodigo = itemView.findViewById(R.id.tvCodigo);
            tvDescricao = itemView.findViewById(R.id.tvDescricao);
        }
    }
}

