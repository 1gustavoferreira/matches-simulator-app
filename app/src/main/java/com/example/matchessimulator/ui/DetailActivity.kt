package com.example.matchessimulator.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.matchessimulator.databinding.ActivityDetailBinding
import com.example.matchessimulator.domain.Match

class DetailActivity : AppCompatActivity() {

    object Extras {
        const val MATCH = "EXTRA_MATCH"
    }

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        loadMatchFromExtra()
    }

    private fun loadMatchFromExtra() {
        intent?.extras?.getParcelable<Match>(Extras.MATCH)?.let {
            Glide.with(this).load(it.place.image).into(binding.ivPlace)
            //NOME NA ACTION BAR DO ESTADIO
            supportActionBar?.title = it.place.name

            binding.tvDescription.text = it.description

            //IMAGEM TIME DE CASA
            Glide.with(this).load(it.homeTeam).into(binding.ivHomeTeam)
            binding.tvHomeTeamName.text = it.homeTeam.name
            binding.rbHomeTeamStars.rating = it.homeTeam.stars.toFloat()
            //EXIBI O PLACAR NA TELA DE DETALHE
                if(it.homeTeam.score!=null){
                    binding.tvHomeTeamScore.text = it.homeTeam.toString()
            }
            //IMAGEM TIME VISITANTE
            Glide.with(this).load(it.awayTeam.image).into(binding.ivAwayTeam)
            binding.tvHomeTeamName.text = it.homeTeam.name
            binding.rbAwayTeamStars.rating = it.awayTeam.stars.toFloat()
            //EXIBI O PLACAR NA TELA DE DETALHE
            if(it.awayTeam.score!=null) {
                binding.tvAwayTeamName.text = it.awayTeam.toString()
            }
        }
    }
}