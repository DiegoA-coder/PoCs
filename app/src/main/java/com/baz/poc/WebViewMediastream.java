package com.baz.poc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class WebViewMediastream extends AppCompatActivity {

    WebView miVisorWeb;
    String content ="<html>\n" +
            "\n" +
            "<body>\n" +
            "    <!--AÑADIR URL DEL SCRIPT DEL PLAYER DE MEDIASTREAM-->\n" +
            "    <script src=\"https://platform-static.cdn.mdstrm.com/js/player_api.js\"></script>\n" +
            "\n" +
            "\n" +
            "    <div class=\"RichTextArticleBody\">\n" +
            "        <div class=\"RichTextArticleBody-body\"> El pequeño hombre de ojos grandes y\n" +
            "            cabeza enorme se ha vuelto viral en todas las <b>redes sociales</b>, pues acapara los stickers de\n" +
            "            WhatsApp, memes y videos virales. <br>\n" +
            "\n" +
            "            <div class=\"Enhancement\">\n" +
            "                <div class=\"Enhancement-item\">\n" +
            "\n" +
            "                    <!--CONTENEDOR QUE SE DEBE REAMPLAZAR POR EL DIV id=\"mdstrm-player\" una vez se obtenga el valor del atributo data-video-id, y setear este valor en el \n" +
            "                    objeto del player en el campo id-->\n" +
            "                    <span class=\"VideoEnhancement\" data-video-disable-history>\n" +
            "                        <div class=\"VideoEnhancement-title\">¡Toda una reina de los memes! Flor Rubio se convirtió en\n" +
            "                            tendencia gracias a sus emociones por la despedida a ‘El Príncipe de la Canción’.</div>\n" +
            "                        <div class=\"VideoEnhancement-player\">\n" +
            "                            <div data-module class=\"MediaStreamVideoPlayer\" data-video-player\n" +
            "                                data-video-id=\"60267672f33383070899f4bf\" data-video-type=\"media\" data-player-id=\"\"\n" +
            "                                data-api-key=\"\" data-analytics-key=\"\" data-account=\"5fea09a071a9945deebf5f7c\"\n" +
            "                                data-video-title=\"¡Toda una reina de los\n" +
            "                                    memes! Flor Rubio se convirtió en tendencia gracias a sus emociones por la despedida a\n" +
            "                                    &#x27;El Príncipe de la Canción&#x27;.\" data-video-description=\"\"\n" +
            "                                data-video-autoplay=\"false\" data-dashurl=\"\"\n" +
            "                                data-hlsurl=\"https://content.uplynk.com/60267672f33383070899f4bf.m3u8\"\n" +
            "                                data-progressiveurl=\"\"\n" +
            "                                data-video-poster=\"https://tvazteca.brightspotcdn.com/dims4/default/083210a/2147483647/strip/true/crop/1920x1080+0+0/resize/160x90!/quality/90/?url=https%3A%2F%2Fx-default-stgec.uplynk.com%2Fausw%2Fslices%2Fd4d%2F9046134590574d34a859a4b9b1ccadff%2Fd4dcd649f4cf4df2a0d8ae165840378d%2Fposter_b72b854435a6478fae8c8c0b461617ad.jpeg\"\n" +
            "                                data-video-channel=\"APP SuperApp\" data-video-program=\"Venga La Alegría\"\n" +
            "                                data-date-published=\"2019-10-10\" data-ima-locale=\"es\"\n" +
            "                                data-ima-adtagurl=\"https://pubads.g.doubleclick.net/gampad/live/ads?env=vp&gdfp_req=1&unviewed_position_start=1&output=xml_vmap1&sz=640x480&description_url=https%3A%2F%2Fwww.tvazteca.com%2Faztecauno%2Fvenga-la-alegria&correlator=&ad_rule=1&ads%3Fslotname=&pp=FormatosVideo&ads%3Fsz=640x480&ciu_szs=&cmsid=2511086&vid=60267672f33383070899f4bf&cust_params=duration%3Dover5min%26Entre_ID%3D60267672f33383070899f4bf&impl=s&url=https://www.tvazteca.com/aztecauno/venga-la-alegria&iu=null\"\n" +
            "                                data-adunit-overlay=\"\" data-disable-ads=\"false\">\n" +
            "                                <div class=\"MediaStreamVideoPlayer-viewport\">\n" +
            "                                    <div class=\"MediaStreamVideoPlayer-player\"></div>\n" +
            "                                </div>\n" +
            "                            </div>\n" +
            "                        </div>\n" +
            "                    </span>\n" +
            "\n" +
            "                    <!--SE DEBE AÑADIR EL CONTENEDOR PARA ALOJAR EL PLAYER DE MEDIASTREAM, ESTE REAMPLAZA AL SPAN class=\"VideoEnhancement\"-->\n" +
            "                    <div id=\"mdstrm-player\"></div>\n" +
            "\n" +
            "\n" +
            "\n" +
            "                </div>\n" +
            "            </div> <br>Se trata de <b>Mohamed Nantoume</b>, aunque en\n" +
            "            internet es mejor conocido como <b>Grand M </b>como una ironía a su diminuto tamaño. <br> <br>'\n" +
            "            <b>Grand' </b>es una sátira a su diminuta estatura y la letra <b>'M' </b>es un homenaje al futbolista\n" +
            "            argentino Lionel Messi. <br> <br>Aunque todos piensan que es un niño, la verdad es que <b>Grand M\n" +
            "            </b>tiene 22 años de edad y padece de enanismo. <br> <br>El sujeto se volvió viral en las <b>redes\n" +
            "                sociales</b>, pues su rostro fue utilizado para crear memes y stickers que ahora abundan en internet.\n" +
            "            <br> <br>No todo ha sido miel sobre hojuelas en la vida de este joven africano. En su momento, confesó al\n" +
            "            medio de comunicación <b> Tchété Music</b>, que sufrió bullying y fue golpeado con piedras en su infancia.\n" +
            "            <br> <br>“Nunca me peleé con nadie y gracias a Dios soy feliz”, expresó el africano al mencionado medio de\n" +
            "            comunicación. <br> <br>Te puede interesar: <span class=\"Enhancement\"><span class=\"Enhancement-item\"><a\n" +
            "                        class=\"Link \"\n" +
            "                        href=\"https://www.tvazteca.com/aztecauno/conductores-memes-reyes-del-playback-lmg-notas\"\n" +
            "                        data-elementdataevent='{                \"event\": \"eventgtm\",                \"eventCategory\":\"click-\",                \"eventAction\": \"  \",                \"eventLabel\": \" https://www.tvazteca.com/aztecauno/conductores-memes-reyes-del-playback-lmg-notas \" }'>\n" +
            "                        Nuestros conductores conquistan los memes con su actuación en Reyes del Playback.\n" +
            "                    </a></span></span> <br>\n" +
            "            <div class=\"Enhancement\">\n" +
            "                <div class=\"Enhancement-item\">\n" +
            "                    <h2> Grand M es un fenómeno viral de las redes sociales </h2>\n" +
            "                </div>\n" +
            "            </div> <br> <b>Grand M </b>aprovechó su viralidad en las redes sociales para formar una\n" +
            "            carrera en el mundo del entretenimiento y en la escena musical. <br> <br>El joven cuenta con 265 mil\n" +
            "            suscriptores en <b> Youtube</b> donde cuenta con videos de sus temas musicales <i>Mon Histoire</i>,\n" +
            "            <i>FÉRÉKÉ</i>, <i> I Dakassa</i> y más. <br> <br>En su cuenta de Instagram acumula 3.8 millones de\n" +
            "            seguidores, red social donde comparte <b>videos </b>para hacer reír a sus fans. <br> <br> <b>Grand M\n" +
            "            </b>comienza a ser más popular entre la industria del espectáculo, pues en el día de su cumpleaños recibió\n" +
            "            una\n" +
            "            felicitación del reguetonero J Balvin. <br> <br>“¡Feliz Cumpleaños, Grand M! Un abrazo de J Balvin”,\n" +
            "            expresó el colombiano en un <b>video</b> de Instagram. <br> <br>Otra de las grandes pasiones de\n" +
            "            <b>Grand M e</b>s el rap, pues incluso llegó a compartir escenario con Baleme, un destacado rapero de Malí\n" +
            "            que\n" +
            "            lo invitó a un concierto. <br> <br>También te puede interesar: <span class=\"Enhancement\"><span\n" +
            "                    class=\"Enhancement-item\"><a class=\"Link \"\n" +
            "                        href=\"https://www.tvazteca.com/aztecauno/exatlon-memes-equipo-azul-fhf-notas\"\n" +
            "                        data-elementdataevent='{                \"event\": \"eventgtm\",                \"eventCategory\":\"click-\",                \"eventAction\": \"  \",                \"eventLabel\": \" https://www.tvazteca.com/aztecauno/exatlon-memes-equipo-azul-fhf-notas \" }'>\n" +
            "                        Exatlón: Los mejores memes que dejó el renacer del equipo azul. </a></span></span> <br>\n" +
            "            <div class=\"Enhancement\">\n" +
            "                <div class=\"Enhancement-item\">\n" +
            "                    <div class=\"InstagramEmbed\">\n" +
            "                        <blockquote class=\"instagram-media\"\n" +
            "                            data-instgrm-permalink=\"https://www.instagram.com/reel/CZxpMhmq0Wu/?utm_source=ig_embed&amp;utm_campaign=loading\"\n" +
            "                            data-instgrm-version=\"14\" style=\" background:#FFF; border:0; border-radius:3px; box-shadow:0\n" +
            "                            0 1px 0 rgba(0,0,0,0.5),0 1px 10px 0 rgba(0,0,0,0.15); margin: 1px; max-width:540px;\n" +
            "                            min-width:326px; padding:0; width:99.375%; width:-webkit-calc(100% - 2px); width:calc(100% -\n" +
            "                            2px);\">\n" +
            "                            <div style=\"padding:16px;\"> <a\n" +
            "                                    href=\"https://www.instagram.com/reel/CZxpMhmq0Wu/?utm_source=ig_embed&amp;utm_campaign=loading\"\n" +
            "                                    style=\" background:#FFFFFF; line-height:0; padding:0 0; text-align:center;\n" +
            "                                    text-decoration:none; width:100%;\" target=\"_blank\">\n" +
            "                                    <div style=\" display: flex; flex-direction: row; align-items: center;\">\n" +
            "                                        <div style=\"background-color: #F4F4F4; border-radius: 50%; flex-grow: 0; height:\n" +
            "                                            40px; margin-right: 14px; width: 40px;\"></div>\n" +
            "                                        <div style=\"display: flex; flex-direction: column; flex-grow: 1; justify-content:\n" +
            "                                            center;\">\n" +
            "                                            <div style=\" background-color: #F4F4F4; border-radius: 4px; flex-grow: 0;\n" +
            "                                                height: 14px; margin-bottom: 6px; width: 100px;\"></div>\n" +
            "                                            <div style=\" background-color: #F4F4F4; border-radius: 4px; flex-grow: 0;\n" +
            "                                                height: 14px; width: 60px;\"></div>\n" +
            "                                        </div>\n" +
            "                                    </div>\n" +
            "                                    <div style=\"padding: 19% 0;\"></div>\n" +
            "                                    <div style=\"display:block; height:50px; margin:0 auto 12px; width:50px;\"><svg\n" +
            "                                            width=\"50px\" height=\"50px\" viewBox=\"0 0 60 60\" version=\"1.1\"\n" +
            "                                            xmlns=\"https://www.w3.org/2000/svg\"\n" +
            "                                            xmlns:xlink=\"https://www.w3.org/1999/xlink\">\n" +
            "                                            <g stroke=\"none\" stroke-width=\"1\" fill=\"none\" fill-rule=\"evenodd\">\n" +
            "                                                <g transform=\"translate(-511.000000, -20.000000)\" fill=\"#000000\">\n" +
            "                                                    <g>\n" +
            "                                                        <path d=\"M556.869,30.41 C554.814,30.41 553.148,32.076\n" +
            "                                                            553.148,34.131 C553.148,36.186 554.814,37.852 556.869,37.852\n" +
            "                                                            C558.924,37.852 560.59,36.186 560.59,34.131 C560.59,32.076\n" +
            "                                                            558.924,30.41 556.869,30.41 M541,60.657 C535.114,60.657\n" +
            "                                                            530.342,55.887 530.342,50 C530.342,44.114 535.114,39.342\n" +
            "                                                            541,39.342 C546.887,39.342 551.658,44.114 551.658,50\n" +
            "                                                            C551.658,55.887 546.887,60.657 541,60.657 M541,33.886\n" +
            "                                                            C532.1,33.886 524.886,41.1 524.886,50 C524.886,58.899\n" +
            "                                                            532.1,66.113 541,66.113 C549.9,66.113 557.115,58.899 557.115,50\n" +
            "                                                            C557.115,41.1 549.9,33.886 541,33.886 M565.378,62.101\n" +
            "                                                            C565.244,65.022 564.756,66.606 564.346,67.663 C563.803,69.06\n" +
            "                                                            563.154,70.057 562.106,71.106 C561.058,72.155 560.06,72.803\n" +
            "                                                            558.662,73.347 C557.607,73.757 556.021,74.244 553.102,74.378\n" +
            "                                                            C549.944,74.521 548.997,74.552 541,74.552 C533.003,74.552\n" +
            "                                                            532.056,74.521 528.898,74.378 C525.979,74.244 524.393,73.757\n" +
            "                                                            523.338,73.347 C521.94,72.803 520.942,72.155 519.894,71.106\n" +
            "                                                            C518.846,70.057 518.197,69.06 517.654,67.663 C517.244,66.606\n" +
            "                                                            516.755,65.022 516.623,62.101 C516.479,58.943 516.448,57.996\n" +
            "                                                            516.448,50 C516.448,42.003 516.479,41.056 516.623,37.899\n" +
            "                                                            C516.755,34.978 517.244,33.391 517.654,32.338 C518.197,30.938\n" +
            "                                                            518.846,29.942 519.894,28.894 C520.942,27.846 521.94,27.196\n" +
            "                                                            523.338,26.654 C524.393,26.244 525.979,25.756 528.898,25.623\n" +
            "                                                            C532.057,25.479 533.004,25.448 541,25.448 C548.997,25.448\n" +
            "                                                            549.943,25.479 553.102,25.623 C556.021,25.756 557.607,26.244\n" +
            "                                                            558.662,26.654 C560.06,27.196 561.058,27.846 562.106,28.894\n" +
            "                                                            C563.154,29.942 563.803,30.938 564.346,32.338 C564.756,33.391\n" +
            "                                                            565.244,34.978 565.378,37.899 C565.522,41.056 565.552,42.003\n" +
            "                                                            565.552,50 C565.552,57.996 565.522,58.943 565.378,62.101\n" +
            "                                                            M570.82,37.631 C570.674,34.438 570.167,32.258 569.425,30.349\n" +
            "                                                            C568.659,28.377 567.633,26.702 565.965,25.035 C564.297,23.368\n" +
            "                                                            562.623,22.342 560.652,21.575 C558.743,20.834 556.562,20.326\n" +
            "                                                            553.369,20.18 C550.169,20.033 549.148,20 541,20 C532.853,20\n" +
            "                                                            531.831,20.033 528.631,20.18 C525.438,20.326 523.257,20.834\n" +
            "                                                            521.349,21.575 C519.376,22.342 517.703,23.368 516.035,25.035\n" +
            "                                                            C514.368,26.702 513.342,28.377 512.574,30.349 C511.834,32.258\n" +
            "                                                            511.326,34.438 511.181,37.631 C511.035,40.831 511,41.851 511,50\n" +
            "                                                            C511,58.147 511.035,59.17 511.181,62.369 C511.326,65.562\n" +
            "                                                            511.834,67.743 512.574,69.651 C513.342,71.625 514.368,73.296\n" +
            "                                                            516.035,74.965 C517.703,76.634 519.376,77.658 521.349,78.425\n" +
            "                                                            C523.257,79.167 525.438,79.673 528.631,79.82 C531.831,79.965\n" +
            "                                                            532.853,80.001 541,80.001 C549.148,80.001 550.169,79.965\n" +
            "                                                            553.369,79.82 C556.562,79.673 558.743,79.167 560.652,78.425\n" +
            "                                                            C562.623,77.658 564.297,76.634 565.965,74.965 C567.633,73.296\n" +
            "                                                            568.659,71.625 569.425,69.651 C570.167,67.743 570.674,65.562\n" +
            "                                                            570.82,62.369 C570.966,59.17 571,58.147 571,50 C571,41.851\n" +
            "                                                            570.966,40.831 570.82,37.631\"></path>\n" +
            "                                                    </g>\n" +
            "                                                </g>\n" +
            "                                            </g>\n" +
            "                                        </svg></div>\n" +
            "                                    <div style=\"padding-top: 8px;\">\n" +
            "                                        <div style=\" color:#3897f0; font-family:Arial,sans-serif; font-size:14px;\n" +
            "                                            font-style:normal; font-weight:550; line-height:18px;\">Ver esta publicación\n" +
            "                                            en\n" +
            "                                            Instagram</div>\n" +
            "                                    </div>\n" +
            "                                    <div style=\"padding: 12.5% 0;\"></div>\n" +
            "                                    <div style=\"display: flex; flex-direction: row; margin-bottom: 14px; align-items:\n" +
            "                                        center;\">\n" +
            "                                        <div>\n" +
            "                                            <div style=\"background-color: #F4F4F4; border-radius: 50%; height: 12.5px;\n" +
            "                                                width: 12.5px; transform: translateX(0px) translateY(7px);\"></div>\n" +
            "                                            <div style=\"background-color: #F4F4F4; height: 12.5px; transform:\n" +
            "                                                rotate(-45deg) translateX(3px) translateY(1px); width: 12.5px; flex-grow: 0;\n" +
            "                                                margin-right: 14px; margin-left: 2px;\"></div>\n" +
            "                                            <div style=\"background-color: #F4F4F4; border-radius: 50%; height: 12.5px;\n" +
            "                                                width: 12.5px; transform: translateX(9px) translateY(-18px);\"></div>\n" +
            "                                        </div>\n" +
            "                                        <div style=\"margin-left: 8px;\">\n" +
            "                                            <div style=\" background-color: #F4F4F4; border-radius: 50%; flex-grow: 0;\n" +
            "                                                height: 20px; width: 20px;\"></div>\n" +
            "                                            <div style=\" width: 0; height: 0; border-top: 2px solid transparent;\n" +
            "                                                border-left: 6px solid #f4f4f4; border-bottom: 2px solid transparent;\n" +
            "                                                transform: translateX(16px) translateY(-4px) rotate(30deg)\"></div>\n" +
            "                                        </div>\n" +
            "                                        <div style=\"margin-left: auto;\">\n" +
            "                                            <div style=\" width: 0px; border-top: 8px solid #F4F4F4; border-right: 8px solid\n" +
            "                                                transparent; transform: translateY(16px);\"></div>\n" +
            "                                            <div style=\" background-color: #F4F4F4; flex-grow: 0; height: 12px; width:\n" +
            "                                                16px; transform: translateY(-4px);\"></div>\n" +
            "                                            <div style=\" width: 0; height: 0; border-top: 8px solid #F4F4F4; border-left:\n" +
            "                                                8px solid transparent; transform: translateY(-4px) translateX(8px);\">\n" +
            "                                            </div>\n" +
            "                                        </div>\n" +
            "                                    </div>\n" +
            "                                    <div style=\"display: flex; flex-direction: column; flex-grow: 1; justify-content:\n" +
            "                                        center; margin-bottom: 24px;\">\n" +
            "                                        <div style=\" background-color: #F4F4F4; border-radius: 4px; flex-grow: 0; height:\n" +
            "                                            14px; margin-bottom: 6px; width: 224px;\"></div>\n" +
            "                                        <div style=\" background-color: #F4F4F4; border-radius: 4px; flex-grow: 0; height:\n" +
            "                                            14px; width: 144px;\"></div>\n" +
            "                                    </div>\n" +
            "                                </a>\n" +
            "                                <p style=\" color:#c9c8cd; font-family:Arial,sans-serif; font-size:14px; line-height:17px;\n" +
            "                                    margin-bottom:0; margin-top:8px; overflow:hidden; padding:8px 0 7px; text-align:center;\n" +
            "                                    text-overflow:ellipsis; white-space:nowrap;\"><a\n" +
            "                                        href=\"https://www.instagram.com/reel/CZxpMhmq0Wu/?utm_source=ig_embed&amp;utm_campaign=loading\"\n" +
            "                                        style=\" color:#c9c8cd; font-family:Arial,sans-serif; font-size:14px;\n" +
            "                                        font-style:normal; font-weight:normal; line-height:17px; text-decoration:none;\"\n" +
            "                                        target=\"_blank\">Una publicación compartida por GRAND M (@grand_m_officiel_)</a>\n" +
            "                                </p>\n" +
            "                            </div>\n" +
            "                        </blockquote>\n" +
            "                        <script async src=\"//www.instagram.com/embed.js\"></script>\n" +
            "                    </div>\n" +
            "                </div>\n" +
            "            </div> <br>\n" +
            "            <div> TV Azteca, S.A.B. de C.V. / Colaboradores: Por: Betzabe Martínez |\n" +
            "                Digital Drive / Sitio web oficial: https://www.tvazteca.com/aztecauno </div>\n" +
            "        </div>\n" +
            "    </div>\n" +
            "\n" +
            "\n" +
            "    <!--Create a new player using the JavaScript API-->\n" +
            "    <script>\n" +
            "        // Options:\n" +
            "        var playerOptions = {\n" +
            "            width: 640, // Definir ancho qué se ajuste a BAZ\n" +
            "            height: 360, // Definir alto qué se ajuste a BAZ\n" +
            "            type: \"media\",\n" +
            "            id: \"60267672f33383070899f4bf\", // Colocar el ID obtenido antes de remplazar el span del atributo data-video-id\n" +
            "            autoplay: false,\n" +
            "            events: { // Callbacks to be triggered when certain actions are executed by the player. All optional.\n" +
            "                onPlayerReady: function () { // Optional callback to be triggered as soon as the player has finished loading\n" +
            "                    console.log(\"Player is ready\");\n" +
            "                },\n" +
            "                onPlay: function () { // Optional callback to be triggered as soon as the player starts playing\n" +
            "                    console.log(\"Playing...\");\n" +
            "                },\n" +
            "                onVideoEnd: function () { // Optional callback to be triggered when the video ends playing\n" +
            "                    console.log(\"Video just ended\");\n" +
            "                },\n" +
            "                onVideoStop: function () { // Optional callback to be triggered when the user stops or pauses the video\n" +
            "                    console.log(\"User stopped or paused the video\");\n" +
            "                },\n" +
            "                onVideoError: function () { // Optional callback to be triggered when there's a playback error\n" +
            "                    console.log(\"There was an error while loading the video\");\n" +
            "                },\n" +
            "                onVolumeChange: function (volume) { // Optional callback to be triggered when volume is changed (0-100)\n" +
            "                    console.log(\"Volume was changed to \" + volume);\n" +
            "                },\n" +
            "                onTimeUpdate: function (time) { // Optional callback to be triggered when time is updated\n" +
            "                    console.log(\"Current time is \" + time);\n" +
            "                },\n" +
            "                onFullscreenChange: function (fullscreen) { // Optional callback to be triggered when fullscreen status change\n" +
            "                    console.log(\"Is fullscreen \" + fullscreen);\n" +
            "                },\n" +
            "                onSeeking: function (time) {\n" +
            "                    console.log(\"Seeking position at:\" + time);\n" +
            "                }\n" +
            "            }\n" +
            "        };\n" +
            "\n" +
            "        var player = new MediastreamPlayer(\"mdstrm-player\", playerOptions);\n" +
            "        player.videoPlay();\n" +
            "\n" +
            "    </script>\n" +
            "</body>\n" +
            "\n" +
            "</html>";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view_mediastream);

        miVisorWeb = (WebView) findViewById(R.id.webView);
        final WebSettings ajustesVisorWeb = miVisorWeb.getSettings();
        ajustesVisorWeb.setJavaScriptEnabled(true);
        miVisorWeb.loadDataWithBaseURL(null,content,"text/html", "UTF-8",null);
    }
}