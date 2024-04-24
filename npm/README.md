# NPM 101

## NPM depedency management
Install a package [https://docs.npmjs.com/cli/v8/commands/npm-install]
```bash
npm install <package-name>
npm install <package1-name> <package2-name> <package3-name>
npm install https://github.com/exemple/package-name/

npm install                             # Assuming we have a package.json present in the directory

npm install -P, --save-prod             # Package will appear in your dependencies. [Default]
npm install -D, --save-dev              # Package will appear in your devDependencies.
npm install -O, --save-optional         # Package will appear in your optionalDependencies.
npm install --no-save                   # Prevents saving to dependencies.
```

uninstall a package
```bash
npm uninstall <package-name>
```

Search for package
```bash
npm search <package-name>
```

Show package information
```bash
npm view <package-name>
```

Upgrade preinstalled
```bash
npm update
```

Lists requirement
```bash
npm ls
```

## NPM Start

Start application
```bash
npm start
```

Build application
```bash
npm build
```

test application
```bash
npm test
```

Exit application
```bash
CTRL + C
```
