package org.example.project

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

import novax.composeapp.generated.resources.Res
import novax.composeapp.generated.resources.compose_multiplatform

@Composable
@Preview
fun App() {
    MaterialTheme {
        var showContent by remember { mutableStateOf(false) }
        Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
            Button(onClick = { showContent = !showContent }) {
                Text("Click me!")
            }
            AnimatedVisibility(showContent) {
                Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.Start) {
                    Text("1. Moteur de Rendu")
                    Text("    Choix initial : Blink (via un projet comme Chromium)")
                    Text("    Évolution : bloqueurs de traqueurs et personnaliser le moteur pour mieux répondre aux besoins.")
                    Text("2. Moteur de Recherche (SearxNG)")
                    Text("    Choix initial : SearxNG à héberger gratuitement sur des plateformes comme Heroku ou des VPS gratuits")
                    Text("3. Blocage de Collecte de Données")
                    Text("    Choix initial : extensions ou modules de blocage de publicités et de traqueurs, comme uBlock Origin ou Privacy Badger")
                    Text("    Évolution : bloqueur intégré de traqueurs ou la possibilité de naviguer en mode anonyme par défaut.")
                    Text("4. Stockage des Données Utilisateur")
                    Text("    Choix initial : Firebase")
                    Text("5. Mises à jour du Navigateur")
                    Text("    Choix initial : utiliser des services comme GitHub Releases pour héberger et distribuer les mises à jour gratuitement.")
                    Text("6. VPN Basique")
                    Text("    Choix initial : ProtonVPN offre des options gratuites.")
                    Text("    Évolution : envisager de proposer un VPN maison un réseau Tor intégré pour une anonymisation renforcée.")
                }
            }
        }
    }
}