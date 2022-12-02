package com.pearl.maditation.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.phoenixdeveloper.meditionui.Feature
import com.phoenixdeveloper.meditionui.R
import com.phoenixdeveloper.meditionui.ui.theme.*

@Composable
fun HomeScreen() {
    Box(
        modifier = Modifier
            .background(DeepBlue)
            .fillMaxSize()
    ) {
        Column {
            GreetingSection()
            ChipSection(chips = listOf("Sweet sleep", "Lunch time", "Study", "Basketball"))
            CurrentMeditation()


        }
    }
}

///***  Home Greeting Section  *******///
@Composable
fun GreetingSection(name: String = "Vivek") {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp)
    ) {
        Column(verticalArrangement = Arrangement.Center) {
            Text(text = "Good Morning $name", style = MaterialTheme.typography.h2)
            Text(text = "We Wish You Have a Good Day !", style = MaterialTheme.typography.body1)
        }
        Icon(
            painter = painterResource(id = R.drawable.ic_search),
            contentDescription = "Search ",
            tint = Color.White,
            modifier = Modifier.size(18.dp)
        )
    }

}

//***  Chips Section

@Composable
fun ChipSection(
    chips: List<String>,
) {
    var selectionChipIndex by remember {
        mutableStateOf(value = 0)
    }
    LazyRow {
        items(chips.size) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .padding(start = 15.dp, bottom = 15.dp, top = 15.dp)
                    .clickable {
                        selectionChipIndex = it
                    }
                    .clip(
                        RoundedCornerShape(10.dp)
                    )
                    .background(
                        if (selectionChipIndex == it) ButtonBlue
                        else DarkerButtonBlue
                    )
                    .padding(15.dp)
            ) {
                Text(text = chips[it], color = TextWhite)
            }
        }
    }
}


@Composable
fun CurrentMeditation(
    color: Color = LightRed,
) {

    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .padding(15.dp)
            .clip(RoundedCornerShape(10.dp))
            .background(color)
            .padding(horizontal = 15.dp, vertical = 20.dp)
            .fillMaxWidth()

    ) {
        Column {
            Text(text = "Daily Thought", style = MaterialTheme.typography.h2)
            Text(text = "Meditation * 3-10 min", style = MaterialTheme.typography.body1)
        }
        Box(contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
                .background(ButtonBlue)

                .padding(10.dp)) {
            Icon(painter = painterResource(id = R.drawable.ic_play),
                contentDescription = "Play",
                tint = Color.White,
                modifier = Modifier.size(16.dp))
        }
    }

}

//*** Freature Section.
@Composable
fun FreatureSection(feature: List<Feature>) {

}


//**? 20:50
//**! https://www.youtube.com/watch?v=g5-wzZUnIbQ&list=PLQkwcJG4YTCSpJ2NLhDTHhi6XBNfk9WiC&index=14