package br.senai.sp.jandira.mytrips.screen

import androidx.compose.material3.TextField
import androidx.compose.material3.Text
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.mytrips.R

@Composable
fun HomeScreen (modifier: Modifier = Modifier){

    Box(
        modifier = Modifier
            .fillMaxSize()
    ){
        Column (
            modifier = Modifier
                .fillMaxSize()
                .background(
                    color = Color(0xFFC0C8D2)
                ),
            verticalArrangement = Arrangement.Center
        ) {
            Column(
                modifier = Modifier
                    .padding(20.dp)
            ) {
                Text(
                    text = stringResource(
                        R.string.login
                    ),
                    color = Color(0xFF283B56),
                    fontSize = 45.sp,
                    fontWeight = FontWeight.Black
                )
                Text(
                    modifier = Modifier
                        .padding(bottom = 50.dp),
                    text = stringResource(
                        R.string.text_sign
                    ),
                    color = Color(0xFF283B56),
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Normal
                )
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    label = {
                        Text(
                            text = stringResource(
                                R.string.email
                            )
                        )
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 15.dp)
                        .padding(bottom = 5.dp),
                    shape = RoundedCornerShape(15.dp)
                )
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    label = {
                        Text(
                            text = stringResource(
                                R.string.password
                            )
                        )
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 15.dp),
                    shape = RoundedCornerShape(15.dp)
                )
                Button(
                    onClick = {},
                    modifier = Modifier
                        .padding(top = 20.dp)
                        .align(Alignment.End),
                    colors = ButtonDefaults.buttonColors(Color(color = 0xFF283B56))
                ){
                    Text(
                        text = stringResource(
                            R.string.sign_in
                        )
                    )
                }
                Row (
                    modifier = Modifier
                        .align(Alignment.End)
                ){
                    Text(
                        text = stringResource(
                            R.string.row
                        ),
                        modifier = Modifier
                            .padding(top = 20.dp),
                        color = Color(0xFF283B56)
                    )
                    Text(
                        text = stringResource(
                            R.string.sign_up
                        ),
                        modifier = Modifier
                            .padding(top = 20.dp),
                        color = Color(0xFF283B56),
                        fontWeight = FontWeight.Black
                    )
                }
            }
        }
        Card(
            modifier = Modifier
                .width(135.dp)
                .height(50.dp)
                .align(Alignment.BottomStart),
            shape = RoundedCornerShape(topEnd = 25.dp),

            colors = CardDefaults
                .cardColors(
                    containerColor = Color(0xFF283B56)
                )
        ) {}
        Card(
            modifier = Modifier
                .width(135.dp)
                .height(50.dp)
                .align(Alignment.TopEnd),
            shape = RoundedCornerShape(bottomStart = 25.dp),

            colors = CardDefaults
                .cardColors(
                    containerColor = Color(0xFF283B56)
                )
        ) {}
    }
}

@Preview(showSystemUi = true)
@Composable
private fun HomeScreenPreview() {
    HomeScreen()
}