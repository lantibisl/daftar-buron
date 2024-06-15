package org.d3if0158.daftarburon.ui.screen

import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import org.d3if0158.daftarburon.R
import org.d3if0158.daftarburon.ui.theme.DaftarBuronTheme

@Composable
fun HapusDialog(
    openDialog: Boolean,
    onDismissRequest: () -> Unit,
    onConfirmation: () -> Unit,
) {
    if (openDialog) {
        AlertDialog(
            text = { Text(text = stringResource(R.string.pesan_hapus)) },
            confirmButton = {
                Button(onClick = { onConfirmation() }) {
                    Text(text = stringResource(R.string.hapus))
                }
            },
            dismissButton = {
                Button(onClick = { onDismissRequest() }) {
                    Text(text = stringResource(R.string.batal))
                }
            },
            onDismissRequest = { onDismissRequest() },
        )
    }
}

@Preview(showBackground = true)
@Preview(uiMode = android.content.res.Configuration.UI_MODE_NIGHT_YES, showBackground = true)
@Composable
fun DeleteDialogPreview() {
    DaftarBuronTheme {
        HapusDialog(
            openDialog = true,
            onDismissRequest = { },
            onConfirmation = { },
        )
    }
}