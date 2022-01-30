# reagent-tailwind

A starting point with Reagent and Tailwind.

## Startup

- Build/REPL: `npx shadow-cljs watch frontend`
- CSS: `npx tailwindcss -i ./src/css/app.css -o ./public/app.css --watch`

## Neovim intellisense support via coc.nvim

```
    "tailwindCSS.includeLanguages": {
        "clojure": "html"
    },
    "[clojure]": {
        "editor.snippetSuggestions": "bottom",
        "tailwindCSS.experimental.classRegex": [
            [
                ":\\w+([^\\s]*)",
                "\\.([^\\.]*)"
            ],
        ]
    },
```

### References
- https://github.com/jacekschae/shadow-reagent
- https://flaviocopes.com/tailwind-setup/
