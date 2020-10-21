package nl.herika.app

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import nl.herika.app.data.Question
import nl.herika.app.databinding.ItemQuestionBinding

class QuestionAdapter(private val questions: List<Question>) : RecyclerView.Adapter<QuestionAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        val binding = ItemQuestionBinding.bind(itemView)

        fun databind(question: Question) {
            binding.questionPlaceholder.text = question.text
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_question, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.databind(questions[position])
    }

    override fun getItemCount(): Int {
        return questions.size
    }
}