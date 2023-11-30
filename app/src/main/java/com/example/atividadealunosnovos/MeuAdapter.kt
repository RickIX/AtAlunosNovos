import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.atividadealunosnovos.R

class MeuAdapter(private val listaItens: List<Itens>) : RecyclerView.Adapter<MeuAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textViewProduto: TextView = itemView.findViewById(R.id.textViewProduto)
        val textViewValor: TextView = itemView.findViewById(R.id.textViewValor)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = listaItens[position]
        holder.textViewProduto.text = item.produto
        holder.textViewValor.text = item.valor.toString()
    }

    override fun getItemCount(): Int {
        return listaItens.size
    }
}
