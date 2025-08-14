# PromptToAPK – No-Desktop-Setup Starter (Kotlin + Compose)

**Cíl:** Pushni tento projekt na GitHub a z mobilu spouštěj workflow, které v cloudu
1) nainstaluje Gradle,
2) vygeneruje Gradle Wrapper,
3) postaví APK,
4) vystaví ho jako artefakt ke stažení.

## Použití
1. Nahraj ZIP obsahu do nového GitHub repozitáře (nebo `git init` a push).
2. (Volitelné) V **Settings → Secrets → Actions** přidej `OPENAI_API_KEY`, pokud chceš generovat změny z promptu.
3. Otevři záložku **Actions** → workflow **prompt-to-apk** → **Run workflow**.
   - Pole **spec** můžeš nechat prázdné (jen postaví APK),
   - nebo zadat popis změn; workflow požádá GPT-5 o unified diff a změny aplikuje.
4. Po doběhu stáhni artefakt **app-debug-apk** (APK soubor).

## Poznámky
- Android Studio **není** potřeba. Vše běží na GitHub Actions.
- Ke spuštění stačí telefon s prohlížečem a GitHub aplikací.
- Pro release APK si doplň část se signováním viz dřívější návod (keystore do Secrets).
